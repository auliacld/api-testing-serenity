package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInfoPage {
    protected static String email="dummy@gmail.com2";
    protected static String password="aa";
    public String endpointAuth = "https://altashop-api.fly.dev/api/auth/info";

    @Step ("I have endpoint auth")
    public String setPostEndpointAuth(){
        return endpointAuth;
    }
    @Step ("I Send endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
    }
    @Step ("I set endpoint get")
        public String setEndpointGet(){
        return endpointAuth;
        }

    @Step ("I send GET HTTP Request")
    public void sendGetUserInfo(){
        SerenityRest.given().get(setEndpointGet());
//        ======================POST======================
        SerenityRest.given().header("Authorization", "Bearer Token").get(setEndpointGet());
    }

    @Step ("I receive valid HTTP Response code 200")
    public void validateGetResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
