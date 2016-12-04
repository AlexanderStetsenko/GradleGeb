import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver
import pages.MyPage

class GebishOrgSpec extends GebReportingSpec {



// Run before all the tests:
    def setupSpec() {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\St\\Desktop\\GradleGeb\\src\\test\\resources\\chromedriver.exe")
        browser.driver = new ChromeDriver()
        println("Initialization done!")
    }

    def "can get to the current Book of Geb"() {

        when: "I open Google site"

        to MyPage
        and: "Enter 'xxx' on search field"
        searchField << "xxx"

        then:
        at MyPage
    }

    def "can get to the current Book of Geb1"() {

        when: "I open Google site"

        to MyPage
        and: "Enter 'xxx' on search field"
        searchField << "xxx"

        then:
        at MyPage
    }
}