package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.GetUserInfoPage;
import starter.pages.PostNewUserLoginPage;

public class GetUserInfoSteps {
    GetUserInfoPage userInfo;

    @Given("user have endpoint auth")
    public void userHaveEndpointAuth() {
        userInfo.setPostEndpointAuth();
    }
    @When("user send endpoint auth")
    public void userSendEndpointAuth() {
        userInfo.sendEndpointAuth();
    }

    @When("user has endpoint to get user information")
    public void userHasEndpointToGetUserInformation() {
        userInfo.setEndpointGet();
    }

    @And("user get user information")
    public void userGetUserInformation() {
        userInfo.sendGetUserInfo();
    }

    @Then("user get user information status code {int}")
    public void userGetUserInformationStatusCode(int arg0) {
        userInfo.validateGetResponseCode200();
    }

}
