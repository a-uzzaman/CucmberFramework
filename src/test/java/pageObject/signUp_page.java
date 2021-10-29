package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class signUp_page {

    public signUp_page (WebDriver driver){
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
    // locators
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLoc;
    @FindBy(how = How.XPATH, using = "//*[@name='lastName']")
    public WebElement lastNameLoc;
    @FindBy(how = How.CSS, using = "#signup-form > input:nth-child(6)")
    public WebElement emailLoc;
    @FindBy(how = How.NAME, using = "month")
    public WebElement monthLocator;

    @FindBy(how = How.NAME, using = "day")
    public WebElement dayLocator;

    @FindBy(how = How.NAME, using = "year")
    public WebElement yearLocator;

    @FindBy(how = How.NAME, using = "agree")
    public WebElement agreeCheckBoxLocator;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement createMyAccBtn;

    @FindBy(how = How.CSS, using = ".alert.alert-success")
    public WebElement successMsg;

    @FindBy(how = How.CSS, using = ".alert.alert-danger p")
    public WebElement emailErrMsg;

    @FindBy(how = How.XPATH, using = "//*[@id='navbarSupportedContent']/ul/li[2]/a")
    public WebElement loginLink;


    // function
    public void enterFirstName(String firstName){
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(firstNameLoc));
        firstNameLoc.clear();
        firstNameLoc.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(lastNameLoc));
        lastNameLoc.clear();
        lastNameLoc.sendKeys(lastName);
    }

    public void enterEmailAddress(String email){
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailLoc));
        emailLoc.clear();
        emailLoc.sendKeys(email);
    }

    public void selectDON(String month, String Day, String Year){
        // wait
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(monthLocator));
        Select Month =new Select(monthLocator);
        Month.selectByVisibleText(month);
        Select day =new Select(dayLocator);
        day.selectByVisibleText(Day);
        Select year =new Select(yearLocator);
        year.selectByVisibleText(Year);
    }
}
