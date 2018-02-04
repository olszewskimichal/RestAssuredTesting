package pl.nmg.fitter.config;


import static io.restassured.RestAssured.expect;
import static org.assertj.core.api.Assertions.assertThat;

import extensions.RestAssuredExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pl.nmg.fitter.TestBase;

@ExtendWith(RestAssuredExtension.class)
class ConfigApiTest extends TestBase {

  @Test
  void shouldGetConfig() {
    OnStartAplicationConfig startAplicationConfig = expect()
        .statusCode(200)
        .then()
        .log()
        .all()
        .given()
        .cookies(getAuthCookies())
        .get("/api/config")
        .as(OnStartAplicationConfig.class);
    assertThat(startAplicationConfig).isNotNull();
  }

}
