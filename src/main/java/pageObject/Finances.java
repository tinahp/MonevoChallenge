package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Finances {

    public WebDriver driver;

    public Finances(WebDriver driver) {
        this.driver = driver;
    }

    //    Locate WebElement[positive Scenerio]

    //   User should be able to provide financial situation and select from the list of bank
    private By halifax = By.cssSelector("div:nth-child(4) button:nth-child(1)");

    //   User should be able to provide pre-tax Income in the input Field
    private By preTax = By.cssSelector("input[type='tel']");

    //  System should print the evidence of the interest populated
    private By preTaxEstimation = By.cssSelector("div[class='section-wrapper'] div[class='block']");

    //   User should be able to click on the pre-tax Income button to proceed
    private By preTaxContinue = By.xpath("//button[@id='continue-button']");

    //   User should be able to provide monthly payment made for mortgage in the input Field
    private By monthlyMortgage = By.xpath("//input[@type='tel']");

    //   User should be able to click on the monthly payment made for mortgage
    private By mortgageContinuebtn = By.cssSelector("#continue-button");

//    //    User should be able to click on the back button and then continue the flow for input monthly loan
//    private By clickBackButton =By.cssSelector(".back-button");

    //   User should be able to provide monthly loan commitment in the past
    private By monthlyLoanPayment = By.xpath("//input[@type='tel']");

    //   User should be able to click on the monthly loan commitment button
    private By monthlyLoanContinuebtn = By.xpath("//button[@id='continue-button']");

    //   User should be able to provide other monthly bill payment
    private By otherMonthlyBill = By.xpath("//input[@type='tel']");

    //   User should be able to click on Terms and Condition
    private By termsAndCondition = By.cssSelector("input[name='terms_consent']");

    //   User should be able to indicate if they would like to receive emails for the credit application
    private By indicateCreditApplication = By.xpath("(//input[@type='checkbox'])[2]");

    //   User should be able to click on the get result button
    private By getResults =By.xpath("(//button[@id='continue-button'])[1]");



    //Action the elements to instantiate the objects

    //    User should able to click on the Halifax button
    public void clickHalifax() {
        driver.findElement(halifax).click();
    }

    //    User should be able to input pre-tax amount  in the input field
    public void inputPretax() {
        driver.findElement(preTax).sendKeys("2000");
    }

   //    User should be able to store pre-estimation value in a String Variable
    public String viewPreTaxEstimation() {
        String viewPreTaxEstimation = driver.findElement(preTaxEstimation).getText();
        return viewPreTaxEstimation;
    }

    //    User should be able to click the pre-tax button to proceed
    public void clickPreTaxButtn() {
        driver.findElement(preTaxContinue).click();
    }

    //    User should be able to input monthly mortgage amount in the input field
    public void inputMonthlyMortgage() {
        driver.findElement(monthlyMortgage).sendKeys("100");
    }

    //    User should be able to click on the monthly mortgage to proceed
    public void clickMonthlyMortgage() {
        driver.findElement(mortgageContinuebtn).click();
    }

    //    User should be abe to input monthly Loan amount in the input field
    public void inputMonthlyLoan() {driver.findElement(monthlyLoanPayment).sendKeys("100");}

    //    User should be able to click on the monthly loan button to proceed
    public void clickMonthlyLoan() { driver.findElement(monthlyLoanContinuebtn).click();}

    //  User should be able to input other bills in the Input Field
    public void inputOtherBill() { driver.findElement(otherMonthlyBill).sendKeys("100");}

    //  User should be able to click on the Terms and Condition to proceed
    public void clickTermsCondition() {
        driver. findElement(termsAndCondition).click();
    }

    //  User should be able to click on the indicate emails to proceed
    public void clickIndicateEmails() {
        driver.findElement(indicateCreditApplication).click();}

   //        User should be able to click on the indicate emails to proceed
    public void clickGetResults() {
            driver.findElement(getResults).click();
    }

}
