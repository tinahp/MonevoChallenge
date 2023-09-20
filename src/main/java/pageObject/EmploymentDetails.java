package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmploymentDetails {

    public WebDriver driver;

    public EmploymentDetails(WebDriver driver){this.driver =driver;}

    //    Locate WebElement[positive Scenerio]

    //    User should be able to click on any of the listed employment status
    private By employmentStatus = By.xpath("//button[normalize-space()='Full Time Employed']");

    //   User should be able to input the type of industry
    private By industry = By.cssSelector("#employmentIndustry");

    //   User should be able to click on the Industry button
    private By industryButton= By.xpath("//button[@id='continue-button']");

    //   User should be able to Input employer name in the input field
    private By employerName = By.cssSelector("#employerName");

    //   User should be able to click on the employer continue button
    private By employerContinue = By.cssSelector("#continue-button");

    //   User should be able to click  on the button on how long the user has worked in the Employers Name
    private By workLength = By.cssSelector("div[class='slot large'] div div:nth-child(2) button:nth-child(1)");

//    //   User should be able to click on the worklegthn continue button
//    private By workLengthButton = By.cssSelector("#continue-button");

    //   User should be able to click on how often they are paid salary whether weekly or monthly
    private By weekly = By.cssSelector("div[class='col-lg-6 button-wrapper offset-lg-3 col-6'] button[class='btn button select-button wizard-button']");

    //   User should be able to click on the continue button for employment
    private By employmentContinue = By.xpath("//button[@id='continue-button']");



    //Action the elements to instantiate the objects
   //    User should be able to click on the EmploymentStatus displayed
    public void clickEmploymentStatus(){driver.findElement(employmentStatus).click();}

    //   User should be abe to input the industry type in the input field
    public void inputIndustryType()throws InterruptedException {
//        Select from the displayed Industry Type
        WebElement SelectResidentType = driver.findElement(By.cssSelector("#employmentIndustry"));
        SelectResidentType.click();
        SelectResidentType.sendKeys("Fashion");
//        SelectResidentType.sendKeys(Keys.ARROW_DOWN);
        SelectResidentType.sendKeys(Keys.ENTER);
        System.out.println("Fashion");

        }
//     User should be able to input employersName in the input field
    public void inputEmployersName(){driver.findElement(employerName).sendKeys("LucyFashion");}

//     User should be able to click on the employer Continue button
    public void clickEmployerContinue(){driver.findElement(employerContinue).click();}

//    User should be able to click on the buttons to specify the length of work
    public void clickWorkLength(){driver.findElement(workLength).click();}

//    public void clickWorkLengthBtn(){driver.findElement(workLengthButton).click();}

//    User should be  able to click on the button to continue
    public void clickWeekly(){driver.findElement(weekly).click();}

//    public void clickWeeklyBtn(){driver.findElement(employmentContinue).click();}




}
