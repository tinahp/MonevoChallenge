package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutYou {
    public WebDriver driver;

    public AboutYou(WebDriver driver) {
        this.driver = driver;
    }


    //    Locate WebElement[positive Scenerio]

    //    User should be  able to select a title attribute
    private By miss = By.xpath("//button[normalize-space()='Miss']");

    //   User should be able to input firstName in the input field
    private By first = By.cssSelector("#firstName");

    //    User should be able to input lastName in the input field
    private By last = By.cssSelector("#lastName");

    //    User should be able to click to contiunue
    private By aboutContinue = By.cssSelector("#continue-button");

    //    User should be able to input date of Birth in the input field
    private By dateBirth = By.cssSelector("#dateOfBirth");

    //    User should be able to input date of Birth in the input field
    private By dobButton = By.xpath("//button[@id='continue-button']");

    //    User should be able to input email address in the input field
    private By emailAdress= By.xpath("//input[@id='emailAddress']");

    //    User should be able to click on the date of Birth button to proceed
    private By emailContinue = By.cssSelector("#continue-button");

    //    User should be able to input mobile number in the input field
    private By phoneNumber = By.cssSelector("#mobileNumber");

    //    User should be able to click on the continue button
    private By phoneContinue = By.cssSelector("#continue-button");

    //    User should be able to click on the civilUnion button
    private By civilUnion = By.cssSelector("div:nth-child(6) button:nth-child(1)");

    //    User should be able to click on the button that specifies the number of dependant
    private By dependant = By.xpath("//button[normalize-space()='2']");





    //Action the elements to instantiate the objects

    //    User should be  able to select a title attribute
    public void clickTitle(){driver.findElement(miss).click();}

    //    User should be able to input firstName in the input field
    public void inputFirstName(){driver.findElement(first).sendKeys("Judith");}

    //    User should be able to input lastName in the input field
    public void inputLastName(){driver.findElement(last).sendKeys("Jackson");}

    //    User should be able to click on the about continue button
    public void clickAboutContinue(){driver.findElement(aboutContinue).click();}

    //    User should be able to input Date of Birth in the input field
    public void inputDateOfBirth(){driver.findElement(dateBirth).sendKeys("01/07/1991");}

    //    User should be able to click on the Date of Birth button
    public void clickDobButton(){driver.findElement(dobButton).click();}

    //    User should be able to input emailaddress in the input field
    public void inputEmailAddress(){driver.findElement(emailAdress).sendKeys("tinahp52+180@gmail.com");}

    //    User should be able to click the email button to contiune
    public void clickInputContinue(){driver.findElement(emailContinue).click();}

    //    User should be able to input mobile number in the input field
    public void inputPhoneNumber(){driver.findElement(phoneNumber).sendKeys("07897641544");}

    //    User should be able to click on the continue button
    public void clickPhoneContinue(){driver.findElement(phoneContinue).click();}

    //    User should be able to click on the civilUnion button
    public void clickCivilUnion(){driver.findElement(civilUnion).click();}

    //    User should be able to click on the button that specifies the number of dependant
    public void clickDependant(){driver.findElement(dependant).click();}











}

