package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PostNewProductPage;

public class PostNewProductSteps {
    @Steps
    PostNewProductPage user;

    @Given("user has endpoint post new product")
    public void userHasEndpointPostNewProduct() {
        user.setPostEndpoint();
    }

    @When("user send post new product")
    public void userSendPostNewProduct() {
        user.sendPostHttpRequest();
    }

    @Then("user see status code {int}")
    public void userSeeStatusCode(int arg0) {
        user.validateHttpResponseCode200();
    }

}
