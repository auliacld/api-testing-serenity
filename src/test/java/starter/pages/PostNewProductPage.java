package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostNewProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    @Step ("I have endpoint post new user")
    public String setPostEndpoint(){
        return endpoint;
    }

    @Step ("I send post new user")
    public void sendPostHttpRequest(){
        String name = "Product Aulia 3";
        String description = "ini product aulia 3";

        String body = "{\n" +
                "    \"name\":" + name + ",\n" +
                "    \"description\":" + description + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpoint());
    }

    @Step("i see status code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

