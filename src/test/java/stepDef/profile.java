package stepDef;

import base.Config;
import io.cucumber.java.en.Then;
import pageObject.myProfile_page;

public class profile extends Config {

    myProfile_page profile = new myProfile_page(driver);

    @Then("I should be successfully log in")
    public void iShouldBeSuccessfullyLogIn() {
        profile.verifyStudentLoggedIn();
    }

}
