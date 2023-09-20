package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanDetails {

    public WebDriver driver;

    public LoanDetails(WebDriver driver) {
        this.driver = driver;
    }

    //    Locate WebElement[positive Scenerio]
//    User should be able to Input loan amount in the input field
    private By loanAmount = By.cssSelector("input[type='tel']");

    //    User should be able to click on the continue button
    private By continuebutton = By.cssSelector("#continue-button");

    //    User should be asked how long will it take to pay off the loan
    private By twoYearsPeriod = By.cssSelector("div[class='row input-container select-button-container'] div:nth-child(1) button:nth-child(1)");

    //    User should be  able to select what the loan  would be used for
    private By carvehicle = By.xpath("//button[normalize-space()='Car / Vehicle']");




    //Action the elements to instantiate the objects

   //   User should be able to Input loan amount in the input field
    public void inputAmount(){driver.findElement(loanAmount).sendKeys("1500");}

    //   User should be able to click on the continue button
    public void clickAmountBtn(){driver.findElement(continuebutton).click();}

    //   User should be able to aske how long will it take to pay off the loan eg Two Years
    public void clickTwoYears(){driver.findElement(twoYearsPeriod).click();}

    //    User should be able to select what the loan  would be used for
    public void clickCarVehicle(){driver.findElement(carvehicle).click();}

    }
