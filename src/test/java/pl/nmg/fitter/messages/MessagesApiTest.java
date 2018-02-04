package pl.nmg.fitter.messages;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import extensions.RestAssuredExtension;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pl.nmg.fitter.TestBase;

@ExtendWith(RestAssuredExtension.class)
class MessagesApiTest extends TestBase {

  @Test
  void shouldLoginToApp() {
    logToApp();
  }

  @Test
  void shouldGetMessageForFitter() {
    List<TextMessageInkasentInfo> messageInkasentInfos = expect()
        .statusCode(200)
        .then()
        .given()
        .log().all()
        .cookies(getAuthCookies())
        .get("/api/comms").jsonPath().getList("", TextMessageInkasentInfo.class);
    assertThat(messageInkasentInfos).isNotNull();
  }

  @Test
  void shouldMarkMessageAsRead() {
    List<TextMessageInkasentInfo> messages = getMessages();
    if (!messages.isEmpty()) {
      TextMessageInkasentInfo textMessageInkasentInfo = messages.get(0);
      String s = expect()
          .statusCode(200)
          .then()
          .given()
          .log().all()
          .cookies(getAuthCookies())
          .get("api/comms/read/{messageId}", textMessageInkasentInfo.getMessageId())
          .getBody().prettyPrint();
      assertThat(s).isEqualTo("Odnotowano przeczytanie");
    } else {
      Assert.fail();
    }
  }

  @Test
  void shouldAddMsgForFitterFromCoordinator() {
    //given
    SendInkasentMessageRequest messageRequest = givenMessageRequest(2L, "Zapraszam na piwo");
    int countMsgBeforeAdd = getMessages().size();
    //when
    String s =
        expect()
            .statusCode(200)
            .then()
            .log().all()
            .given()
            .cookies(getAuthCookies())
            .contentType("application/json")
            .body(messageRequest)
            .when()
            .post("/api/coords/inkasent/message")
            .getBody().prettyPrint();
    //then
    assertAll(
        () -> assertThat(s).isNotNull().isEqualTo("Wiadomość została wysłana do 1 monterów"),
        () -> assertThat(getMessages().size()).isNotNull().isEqualTo(countMsgBeforeAdd + 1)
    );
  }

  private List<TextMessageInkasentInfo> getMessages() {
    List<TextMessageInkasentInfo> then = given()
        .cookies(getAuthCookies())
        .when()
        .get("/api/comms")
        .jsonPath().getList("", TextMessageInkasentInfo.class);
    return then;
  }

  private SendInkasentMessageRequest givenMessageRequest(Long fitterId, String msg) {
    SendInkasentMessageRequest messageRequest = new SendInkasentMessageRequest();
    messageRequest.setDoPersist(true);
    messageRequest.setFitter(Collections.singletonList(fitterId));
    messageRequest.setInfoPriority(fitterId);
    messageRequest.setMessage(msg);
    return messageRequest;
  }


}
