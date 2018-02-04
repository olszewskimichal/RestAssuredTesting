package pl.nmg.fitter.ot;

import static io.restassured.RestAssured.expect;
import static org.assertj.core.api.Assertions.assertThat;

import extensions.RestAssuredExtension;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pl.nmg.fitter.TestBase;
import pl.nmg.fitter.tso.FitterOTSearchRequest;
import pl.nmg.fitter.tso.FitterTechnicalServiceOrder;

@ExtendWith(RestAssuredExtension.class)
class OtOrdersApiTest extends TestBase {

  @Test
  void shouldReturnOrderById() {
    FitterTechnicalServiceOrder as = expect()
        .statusCode(200)
        .then()
        .log().all()
        .given()
        .cookies(getAuthCookies())
        .get("/api/ot/byid/{orderId}", 51L)
        .as(FitterTechnicalServiceOrder.class);
    assertThat(as).isNotNull();
    assertThat(as.getTechnicalServiceId()).isEqualTo(51L);
  }

  @Test
  void shouldReturnOrdersForFitter() {
    FitterOTSearchRequest fitterOTSearchRequest = new FitterOTSearchRequest();
    fitterOTSearchRequest.setFitter(2L);

    List<FitterTechnicalServiceOrder> list = expect()
        .statusCode(200)
        .then()
        .log().all()
        .given()
        .cookies(getAuthCookies())
        .contentType("application/json")
        .body(fitterOTSearchRequest)
        .post("/api/ot/filter")
        .getBody()
        .jsonPath()
        .getList("", FitterTechnicalServiceOrder.class);
    assertThat(list).isNotNull().isNotEmpty();
  }

}
