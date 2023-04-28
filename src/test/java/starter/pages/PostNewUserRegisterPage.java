package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class PostNewUserRegisterPage {
    public String endpoint = "https://altashop-api.fly.dev/api/auth/register";

    @Step ("I have endpoint post new user")
    public String setPostEndpoint(){
        return endpoint;
    }

    @Step ("I send post new user")
    public void sendPostHttpRequest(){
        String email = "dummy@gmail.com4";
        String password = "aa";
        String fullname = "Aulia Claudia Rahma";

        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "    \"fullname\":" + fullname + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpoint());
    }

    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
