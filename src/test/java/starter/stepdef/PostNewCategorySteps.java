package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PostNewCategoryPage;

public class PostNewCategorySteps {
    @Steps
    PostNewCategoryPage category;

    @Given("user has endpoint post new category")
    public void userHasEndpointPostNewCategory() {
        category.setPostEndpoint();
    }

    @When("user send post new category")
    public void userSendPostNewCategory() {
        category.sendPostHttpRequest();
    }
}
