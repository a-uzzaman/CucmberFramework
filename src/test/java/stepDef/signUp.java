package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageObject.signUp_page;

public class signUp extends Config {

    signUp_page signup = new signUp_page(driver);
    Faker faker = new Faker();

    @And("I enter student information with valid email address")
    public void iEnterStudentInformationWithValidEmailAddress() {
        // first name
        String firstName = faker.name().firstName();
        signup.enterFirstName(firstName);
        // last name
        String lastName = faker.name().lastName();
        signup.enterLastName(lastName);
        // email
        String email = faker.internet().safeEmailAddress();
        signup.enterEmailAddress(email);
    }

    @And("I enter student information with invalid email address")
    public void iEnterStudentInformationWithInvalidEmailAddress() {
        String firstName = faker.name().firstName();
        signup.enterFirstName(firstName);
        // last name
        String lastName = faker.name().lastName();
        signup.enterLastName(lastName);
        // email
        String email = "fakeemail@gmail";
        signup.enterEmailAddress(email);
    }


    @And("I enter student DOB")
    public void iEnterStudentDOB(DataTable table) {
        System.out.println(table.cell(0,0));
        signup.selectDON(table.cell(0,0), table.cell(0,1), table.cell(0,2) );
    }


    @And("^We use example for ([^\"]*), ([^\"]*) and ([^\"]*)$")
    public void weUseExampleForMonthDayAndYear(String month, String day, String year) {
        signup.selectDON(month,day,year);
    }
}
