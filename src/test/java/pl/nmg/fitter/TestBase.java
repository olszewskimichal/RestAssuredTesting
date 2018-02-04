package pl.nmg.fitter;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.get;

import java.util.Map;

public abstract class TestBase {

  public void logToApp() {
    expect()
        .statusCode(200)
        .given()
        .when()
        .log().all()
        .get("/login/basic?j_username=administrator&j_password=e5")
        .then().log().all();
  }

  public Map<String, String> getAuthCookies() {
    return get("/login/basic?j_username=administrator&j_password=e5")
        .thenReturn().getCookies();
  }

}
