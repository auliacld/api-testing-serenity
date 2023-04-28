package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class GetProductPage {
    public String endpoint = "https://altashop-api.fly.dev/api/products";

    public String InvalidEndpoint = "https://altashop-api.fly.dev/api/product";

    @Step ("I set GET API endpoint by id")
    public String setByIDApiEndpoint(){
        return endpoint + "/11274";
    }


    @Step ("I set GET api endpoint")
    public String setApiEndpoint(){
        return endpoint;
    }

    @Step ("I set GET invalid api endpoint")
    public String setInvalidApiEndpoint(){
        return InvalidEndpoint;
    }

    @Step ("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step ("I receive valid HTTP Response code 200")
    public void validateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ("I send GET HTTP Request")
    public void sendGetDetailById() {
        SerenityRest.given().get(setByIDApiEndpoint());
    }

    @Step ("I send GET HTTP Request")
    public void SendGetHttpRequest() {
        SerenityRest.given().get(setInvalidApiEndpoint());
    }
    @Step ("I receive valid HTTP Response code 404")
    public void getResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
