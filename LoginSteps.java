package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LoginSteps {

    @Given("^I go to dev.giftrete.com$")
    public void iGoToDevGiftreteCom() throws Throwable {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Moi\\IdeaProjects\\myfirstproject\\src\\test\\Resources\\Features\\geckodriver.exe");

        WebDriver driver= new FirefoxDriver();
        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);

    }

    @When("^I go to login page$")
    public void i_go_to_login_page() throws Throwable {


    }

    @When("^I enter valid username$")
    public void i_enter_valid_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter valid password$")
    public void i_enter_valid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I will be able to login in$")
    public void i_will_be_able_to_login_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I enter invalid password$")
    public void i_enter_invalid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I will not be able to login in$")
    public void i_will_not_be_able_to_login_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter invalid username$")
    public void i_enter_invalid_username() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @When("^I enter valid username \"([^\"]*)\"$")
    public void i_enter_valid_username(String username) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter valid password \"([^\"]*)\"$")
    public void i_enter_valid_password(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I log out$")
    public void i_log_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }


}