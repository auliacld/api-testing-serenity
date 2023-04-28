package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PostNewUserRegisterPage;

public class PostNewUserRegisterSteps {
    @Steps
    PostNewUserRegisterPage register;

    @Given("user has endpoint post new user register")
    public void userHasEndpointPostNewUserRegister() {
        register.setPostEndpoint();
    }

    @When("user send post new user register")
    public void userSendPostNewUserRegister() {
        register.sendPostHttpRequest();
    }

    @Then("user get status code {int}")
    public void userGetStatusCode(int arg0) {
        register.validateHttpResponseCode200();
    }
}
