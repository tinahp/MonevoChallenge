package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import pageObject.*;

public class BaseClass {
    public static WebDriver driver;

    public WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    protected LoanDetails loanDetails;
    protected AboutYou aboutYou;
    protected AddressInformation addressInformation;
    protected EmploymentDetails employmentDetails;
    protected Finances finances;
    protected NegativeLoanDetails negativeLoanDetails;


    @BeforeTest
    public void SetUp() {
        // reports = ExtentManager.getReports();
        // test = reports.createTest("BaseClassTest");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("---disable notifications");
        //Set Chrome Browser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://qa-5.monevo.com/apply/loan-details/amount");


    }

    }
