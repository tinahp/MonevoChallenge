package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddressInformation {
    public WebDriver driver;

    public AddressInformation(WebDriver driver) {
        this.driver = driver;
    }

    //    Locate WebElement[positive Scenerio]

    //    User should be able to input postCode
    private By inputPostCode = By.cssSelector("#currentAddressPostcode");

    //User should be able to click on the find postCode button and select preferred address
    private By searchPostCode = By.xpath("//div[@class='button search-button wizard-button']");

    //User should be able to select current resident Type from the list
    private By selectResidentType = By.xpath("//div[normalize-space()='77 Sedgeborough Road']");

    //User should be able to state what type of residency owner they are
    private By homeOwnerMortgage = By.xpath("//button[normalize-space()='Homeowner - With Mortgage']");

    //User should be able to click on the button for how long they have lived there
    private By sixMonths = By.xpath("//button[normalize-space()='6 months or less']");

    //User should be able to provide previous address in the input field
    private By previousAddress = By.cssSelector("#previousAddressPostcode");

    //User should be able to click on the find previous address button
    private By previousAddressBtn = By.cssSelector(".button.search-button.wizard-button");

    //User should be able to click on the preferred address from the list
    private By previousAddressType = By.xpath("//div[normalize-space()='143 Dragon Lane']");

    //User should be able to click on the find button to search previous address list
    private By aboutAYear = By.xpath("(//button[normalize-space()='6 months or less'])[1]");

    //User should be able to click on the find button to continue
//    private By aboutAYearButton = By.xpath("//button[@id='continue-button']");



    //Action the elements to instantiate the objects
    //    User should be able to input postCode in the input Field
    public void inputPostCode() {
        driver.findElement(inputPostCode).sendKeys("M16 7EF");
    }

    //   User should be able to click on the find postCode button and search postCode
    public void clickPostCode() throws InterruptedException {
        driver.findElement(searchPostCode).click();}

    //   User should be able to click on the find postCode button and select preferred address
    public void inputResidentType() throws InterruptedException {
//        Select from the Resident Type displayed
        List<WebElement> resident = driver.findElements(By.xpath("//div[normalize-space()='77 Sedgeborough Road']"));
        for (WebElement reside : resident) {
            // loop into with each item
            reside.click(); // Click resident
            reside.getText(); // Get the text of the item
            System.out.println("77 Sedgeborough Road");
        }
    }

    //   User should be able to click on the homeOwner Mortgage button to proceed
    public void clickHomeOwnerMortgage() {
        driver.findElement(homeOwnerMortgage).click();}

    //   User should be able to click on how log eg six months, 1 year
    public void clickSixMonth() {driver.findElement(sixMonths).click();}

    //   User should be able to click on the homeOwner Mortgage button  to proceed
    public void clickPreviousAddress(){driver.findElement(previousAddress).sendKeys("L35 3QU");}

    //   User should be able to click on the previous Address button to proceed
    public void clickPreviousAddressBtn(){driver.findElement(previousAddressBtn).click();}

    //   User should be able to input the previous Address in the input field
    public void inputAddressType() throws InterruptedException {
//        Select from the displayed Address Type
        List<WebElement> address = driver.findElements(By.xpath("//div[normalize-space()='143 Dragon Lane']"));
        for (WebElement addressType : address) {
            // loop into with each item
            addressType.click(); // Click the item
            addressType.getText(); // Get the text of the item
            System.out.println("143 Dragon Lane");
        }
    }
//    public void clickSearchAddress1() {driver.findElement(searchAddress).click();}

//   User should be able to  click on the number of year of their choice
    public void clickAboutYear() {driver.findElement(aboutAYear).click();}

//    public void clickAboutYear1() {driver.findElement(aboutAYearButton).click();}


    }




