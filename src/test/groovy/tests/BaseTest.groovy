package tests

import geb.junit4.GebReportingTest
import geb.junit4.GebTest
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.openqa.selenium.chrome.ChromeDriver




abstract class BaseTest extends GebReportingTest{

    @BeforeClass
    public  void setUp() throws Exception {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\St\\Desktop\\GradleGeb\\src\\test\\resources\\chromedriver.exe")

        browser.driver = new ChromeDriver()
        browser.getDriver().manage().window().maximize()
    }

    @AfterClass
    public  void tearDown() throws Exception {
        //browser.close()

    }
}
