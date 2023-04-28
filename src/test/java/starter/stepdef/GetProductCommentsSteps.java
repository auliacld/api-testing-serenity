package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.GetCommentProductPage;
import starter.pages.GetRatingProductPage;

public class GetProductCommentsSteps {
    @Steps
    GetCommentProductPage commentProduct;
    @Given("user has endpoint get product comments")
    public void userHasEndpointGetProductComments() {
        commentProduct.getApiProductCommentEndpoint();
    }

    @When("user get product comments")
    public void userGetProductComments() {
        commentProduct.sendGetCommentHttpRequest();
    }

    @Then("user get product comments status code {int}")
    public void userGetProductCommentsStatusCode(int arg0) {
        commentProduct.validateGetProductCommentResponseCode200();
    }
}
