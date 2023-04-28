package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetCommentProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    @Step ("I set GET API Product Comments Endpoint")
    public String getApiProductCommentEndpoint() {
        return endpoint + "/9979" + "/comments";
    }

    @Step ("I send GET HTTP Request")
    public void sendGetCommentHttpRequest(){
        SerenityRest.given().get(getApiProductCommentEndpoint());
    }

    public void validateGetProductCommentResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
