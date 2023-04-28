package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.GetProductPage;

public class GetProductsSteps {
    @Steps
    GetProductPage product;

    @Given("user has endpoint")
    public void userHasEndpoint() {
        product.setApiEndpoint();
    }

    @When("user get all detail product")
    public void userGetAllDetailProduct() {
        product.sendGetHttpRequest();
    }

    @Then("user get product status code {int}")
    public void userGetProductStatusCode(int arg0) {
        product.validateHttpResponseCode200();
    }

    @Given("user has endpoint get api")
    public void userHasEndpointGetApi() {
        product.setByIDApiEndpoint();
    }

    @When("user get detail by id")
    public void userGetDetailById() {
        product.sendGetDetailById();
    }

    @Given("user has invalid endpoint")
    public void userHasInvalidEndpoint() {
        product.setInvalidApiEndpoint();
    }

    @When("user not found get detail product")
    public void userNotFoundGetDetailProduct() {
        product.SendGetHttpRequest();
    }

    @Then("user get code status {int}")
    public void userGetCodeStatus(int arg0) {
        product.getResponseCode404();
    }
}
