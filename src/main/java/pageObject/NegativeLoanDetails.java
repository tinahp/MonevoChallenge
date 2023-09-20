package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NegativeLoanDetails {
    public WebDriver driver;

    public NegativeLoanDetails(WebDriver driver) {
        this.driver = driver;
    }


    //   Locate WebElement[Negative Scenerio]

    //   User should be  able to select a title attribute
    private By negativemiss = By.xpath("//button[normalize-space()='Miss']");

    //   User should be able to input firstName in the input field
    private By negativefirst = By.cssSelector("#firstName");

    //    User should be able to input lastName in the input field
    private By negativelast = By.cssSelector("#lastName");

    //    User should be able to click to contiunue
    private By negativeboutContinue = By.cssSelector("#continue-button");

    //    User should be able to input date of Birth in the input field
    private By negativedateBirth = By.cssSelector("#dateOfBirth");

    //    User should be able to input date of Birth in the input field
    private By negativedobButton = By.xpath("//button[@id='continue-button']");

    //    User should be able to input email address in the input field
    private By negativeemailAdress= By.xpath("//input[@id='emailAddress']");

    //    User should be able to click on the date of Birth button to proceed
    private By negativeemailContinue = By.cssSelector("#continue-button");

    //    User should be able to input mobile number in the input field
    private By negativephoneNumber = By.cssSelector("#mobileNumber");

    //    User should be able to click on the continue button
    private By negativephoneContinue = By.cssSelector("#continue-button");

    //    System should throw an error once the phone number is invalid
    private By negativeInputtednumber = By.xpath("//div[@class='error']");




//    Action the Negative elements to instantiate the objects

    //    User is able to select a title attribute
    public void negclickTitle(){driver.findElement(negativemiss).click();}

    //    User is able to input firstName in the input field
    public void neginputFirstName(){driver.findElement(negativefirst).sendKeys("Judith");}

    //    User is able to input lastName in the input field
    public void neginputLastName(){driver.findElement(negativelast).sendKeys("Jackson");}

    //    User is able to click on the about continue button
    public void neglickAboutContinue(){driver.findElement(negativeboutContinue).click();}

    //    User is able to input Date of Birth in the input field
    public void neginputDateOfBirth(){driver.findElement(negativedateBirth).sendKeys("01/07/1991");}

    //    User is able to click on the Date of Birth button
    public void negclickDobButton(){driver.findElement(negativedobButton).click();}

    //    User is able to input emailaddress in the input field
    public void neginputEmailAddress1(){driver.findElement(negativeemailAdress).sendKeys("tinahp52+180@gmail.com");}

    //    User is able to click the email button to contiune
    public void negclickInputContinue(){driver.findElement(negativeemailContinue).click();}

    //    User is able to input mobile number in the input field
    public void neginputPhoneNumber(){driver.findElement(negativephoneNumber).sendKeys("310-323-258");}

    //    User is able to click on the continue button
    public void negclickPhoneContinue(){driver.findElement(negativephoneContinue).click();}

    //validate errorMessage that pops underneath the input field
    public String negativeError () {
        String negPhoneError = driver.findElement(negativeInputtednumber).getText();
        return negPhoneError;

    }

}