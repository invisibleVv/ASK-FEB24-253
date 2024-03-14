package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Helper;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class AskStepsDef {

    @Given("Navigate to {string} page")
    public void navigateToPage(String url) {
        getDriver().get(Helper.getUrlFor(url));
    }

    @When("Enter {string} into {string} input field")
    public void enterIntoInputField(String name, String elementName) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.getXpathFor(elementName))));
        String element = Helper.getString(name);
        getDriver().findElement(By.xpath(Helper.getXpathFor(elementName))).sendKeys(element);
    }

    @And("Fill out the rest of the form input fields as required")
    public void fillOutTheRestOfTheFormInputFieldsAsRequired() {
        getDriver().findElement(By.xpath(Helper.getXpathFor("Last Name"))).sendKeys("garbyzov");
        getDriver().findElement(By.xpath(Helper.getXpathFor("Email"))).sendKeys("777smc@domaaain12.online");
        getDriver().findElement(By.xpath(Helper.getXpathFor("Group Code"))).sendKeys("BBB");
        getDriver().findElement(By.xpath(Helper.getXpathFor("Password"))).sendKeys("Test123");
        getDriver().findElement(By.xpath(Helper.getXpathFor("Confirm Password"))).sendKeys("Test123");
    }

    @Then("Click on the {string} button at the bottom of the page")
    public void clickOnTheButtonAtTheBottomOfThePage(String elementName) {
        getDriver().findElement(By.xpath(Helper.getXpathFor(elementName))).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        try {
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Helper.getXpathFor("sysMes"))));
            assertThat(errorMessage.isDisplayed()).isTrue();
            System.out.println("System error is displayed");
        } catch (TimeoutException e) {
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Helper.getXpathFor("successful registration"))));
            assertThat(successMessage.isDisplayed()).isTrue();
            WebElement message = getDriver().findElement(By.xpath(Helper.getXpathFor("confirmation message")));
            String actualResult = message.getText();
            String expectedResult = "Your registration is completed now. To verify your identity we've sent you email with activation link. Please check you email and activate your account.";
            assertThat(actualResult).isEqualTo(expectedResult);
            System.out.println("Registration completed");
        }
    }

    @Then("Leave the {string} field empty")
    public void leaveTheFieldEmpty(String elementName) {
        getDriver().findElement(By.xpath(Helper.getXpathFor(elementName))).click();
    }

    @Then("Click on an {string} on the page")
    public void clickOnAnOnThePage(String elementName) {
        getDriver().findElement(By.xpath(Helper.getXpathFor(elementName))).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(3));
        try {
            WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Helper.getXpathFor("errorMessage1"))));
            assertThat(errorMessage.isDisplayed()).isTrue();
            System.out.println("Error message is displayed");
        }  catch (TimeoutException e) {
            WebElement requiredMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Helper.getXpathFor("errorMessage2"))));
            assertThat(requiredMessage.isDisplayed()).isTrue();
            System.out.println("Message - 'This field is required' is displayed");
        }
    }

}
