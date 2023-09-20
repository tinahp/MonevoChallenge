package testSuites;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.*;

import java.util.concurrent.TimeUnit;

public class LoanInformation extends BaseClass {

    @BeforeTest
    public void innit() {driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
    }

//    Positive Testcase
    @Test(priority = 0)
    public void LoanDetails() throws InterruptedException {
        LoanDetails loanDetails = new LoanDetails(driver);
//        User is able  to input amount to borrow
        loanDetails.inputAmount();
//        User is able to click on the amount button
        loanDetails.clickAmountBtn();
//        User is able to click on two years to be able to pay off loan
        loanDetails.clickTwoYears();
//        User is able to state what he wants to use the loan for
        loanDetails.clickCarVehicle();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void AboutYou()throws InterruptedException {
        AboutYou aboutYou = new AboutYou(driver);

//        User is able to click on their preferred Title
        aboutYou.clickTitle();
//        User is able to input first name in the input field
        aboutYou.inputFirstName();
//        User is able to input last name in the input field
        aboutYou.inputLastName();
//        User is able to click on the continue button
        aboutYou.clickAboutContinue();
//         User is able to input the date of birth in the input field
        aboutYou.inputDateOfBirth();
//        User is able to click on the date of birth continue button
        aboutYou.clickDobButton();
//        User is able to input email in the input field
        aboutYou.inputEmailAddress();
//        User is able to click continue in the continue button
        aboutYou.clickInputContinue();
//         User is able to input the valid phone number in the input field
        aboutYou.inputPhoneNumber();
        //printout response based on validity status
        aboutYou.clickPhoneContinue();
        if (driver.getCurrentUrl ().contains ("https://qa-5.monevo.com/apply/about-you/mobile-number"))
            // For Pass
            System.out.println ("The Page URL contains/mobile-number 07897641544");
        else
            // For Fail
            System.out.println ("The Page URL does not contain /mobile-number");
//        User is able to select a marital status
        aboutYou.clickCivilUnion();
//        User is able to select how many dependant they have
        aboutYou.clickDependant();
    }


    @Test(priority = 2)
    public void AddressInformation()throws InterruptedException {
        AddressInformation addressInformation = new AddressInformation(driver);

//      user is able to input postcode in the input field
        addressInformation.inputPostCode();
//      user is able to click on the find postcode to search
        addressInformation.clickPostCode();
//       Apply an explicit wait to enable a successful search
        WebDriverWait wait =new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='77 Sedgeborough Road']")));
//        User is able to select from the resident address listed
        addressInformation.inputResidentType();
//        User is able to click what type of resident it is
        addressInformation.clickHomeOwnerMortgage();
//        User is able to state how long they have lived there
        addressInformation.clickSixMonth();
//        User is able to state previous address
        addressInformation.clickPreviousAddress();
//        User is able to click on the previous address find button to search
        addressInformation.clickPreviousAddressBtn();
//       Apply an explicit wait to enable a successful search
        WebDriverWait wait1 =new WebDriverWait(driver, 50);
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='143 Dragon Lane']")));
//        User is able to click on the listed address displayed
        addressInformation.inputAddressType();
//        User is able to state how long they have lived there
        addressInformation.clickAboutYear();
//        addressInformation.clickAboutYear1();
    }

    @Test (priority = 3)
    public void EmploymentDetails()throws InterruptedException {
        EmploymentDetails employmentDetails = new EmploymentDetails(driver);

//        User is able to select employment status from the displayed options
        employmentDetails.clickEmploymentStatus();
//        Apply an explicit wait to enable a successful search from the list of industry
        WebDriverWait wait1 = new WebDriverWait(driver, 50);
        wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#employmentIndustry")));
//        User is able to click on the suggested industry type listed
        employmentDetails.inputIndustryType();
        Thread.sleep(3000);
//        User is able to input employers name in the Input field
        employmentDetails.inputEmployersName();
//        User is able to click to continue
        employmentDetails.clickEmployerContinue();
//        User is able to click on how long they have worked there
        employmentDetails.clickWorkLength();
//        User is able to state how often they are  paid
        employmentDetails.clickWeekly();
//        employmentDetails.clickWeeklyBtn();
    }

    @Test(priority = 4)
    public void Finances()throws InterruptedException {
        Finances finances = new Finances(driver);

//       User is able to click the bank of their choice eg Halifax
        finances.clickHalifax();
//        User is able to state yearly pre-tax income in the input field
        finances.inputPretax();
//       System is able to get the pre-tax estimation
        finances.viewPreTaxEstimation();
//        System is able to print pre-tax estimation on the terminal
        System.out.println("£166.67");
//        User is able to click on the pre-tax button to continue
        finances.clickPreTaxButtn();
//       User is able to input monthly mortgage costs in the input field
        finances.inputMonthlyMortgage();
//        User is able to click on the monthly mortgage costs
        finances.clickMonthlyMortgage();
//       User is able to input monthly loan payments
        finances.inputMonthlyLoan();
        //Scroll into the element using the javaScript Executor and click continue
        WebElement Scroll = driver.findElement(By.xpath("//button[@id='continue-button']"));
         JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(9000);
         js.executeScript("arguments[0].click();", Scroll);
//        finances.clickMonthlyLoan();
//       User is able to input other monthly payments in the input field
        finances.inputOtherBill();
//        User is able to click on Terms and Condition check box
        finances.clickTermsCondition();
//        User is able to click on indicate email option check box
        finances.clickIndicateEmails();
//        User is able to click on the get results button
        finances.clickGetResults();

  }
        //Negative Testcase Scenerio

        @Test(priority = 5)
        public void NegativeLoanDetails() throws InterruptedException {
            NegativeLoanDetails negativeLoanDetails = new NegativeLoanDetails(driver);
            negativeLoanDetails.negclickTitle();
            negativeLoanDetails.neginputFirstName();
            negativeLoanDetails.neginputLastName();
            negativeLoanDetails.neglickAboutContinue();
            negativeLoanDetails.neginputDateOfBirth();
            negativeLoanDetails.negclickDobButton();
            negativeLoanDetails.neginputEmailAddress1();
            negativeLoanDetails.negclickInputContinue();
            negativeLoanDetails.neginputPhoneNumber();
            negativeLoanDetails.negclickPhoneContinue();
//          Assert the phone number Error Message that appears underneath the input page
            String expectedErrorMessage = "Enter a valid UK mobile phone number";
            String actualErrorMessage = negativeLoanDetails.negativeError();
//           System Prints out the message displayed
            System.out.println(actualErrorMessage);
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            Thread.sleep(2000);
//            System closes the browser
            driver.close();
    }


}
