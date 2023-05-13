package starter.pages;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryByIdPage {
    public String endpoint = "https://altashop-api.fly.dev/api/categories";
    public String invalidEndpoint = "https://altashop-api.fly.dev/api/category";

    @Step ("I set GET Category endpoint by id")
    public String getEndpointGetCategoryApi(){
        return endpoint + "/11027";
    }

    @Step ("I set GET Category endpoint")
    public String getApiAllCategory() {
        return endpoint;
    }

    @Step ("I send GET Category HTTP Request")
    public void getRequestGetCategoryById(){
        SerenityRest.given().get(getEndpointGetCategoryApi());
    }

    @Step ("I receive valid HTTP Response code 200")
    public void GetCategorybyIDResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step ("I send GET Category HTTP Request")
    public void getAllCategory() {
        SerenityRest.given().get(getApiAllCategory());
    }

    public String getWithInvalidEndpoint() { return invalidEndpoint;
    }

    public void sendInvalidEndpoint() {
        SerenityRest.given().get(getWithInvalidEndpoint());
    }

    public void seeMessageCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
