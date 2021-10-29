package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.signIn_page;

public class signIn extends Config {

    signIn_page signIn = new signIn_page(driver);

    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {
        // requirements
        String exp = "Sign In";
        // Act is ==> what IT team or dev implement
        Assert.assertEquals(driver.getTitle(), exp);
    }

    @And("I click on Create New Account button")
    public void iClickOnCreateNewAccountButton() {
        signIn.clickCreateNewAccountButton();
    }

    @And("I enter student email address")
    public void iEnterStudentEmailAddress() {
        signIn.enterStudentEmailAddress("qa.test559@gmail.com");
    }

    @And("I enter student email address as {string}")
    public void iEnterStudentEmailAddressAs(String email) {
        signIn.enterStudentEmailAddress(email);
    }


    @And("I enter student password")
    public void iEnterStudentPassword() {
        signIn.enterStudentPassword("Te$t1234");
    }

    @And("I enter student password as {string}")
    public void iEnterStudentPasswordAs(String password) {
        signIn.enterStudentPassword(password);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void hasanTest(String password) {
        signIn.enterStudentPassword(password);
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        signIn.clickLoginButton();
    }



    //"^I am on Home Page of \"([^\"]*)\"$"
}
