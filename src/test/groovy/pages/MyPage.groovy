package pages

import geb.Page

/**
 * Created by St on 03.12.2016.
 */
class MyPage extends Page  {
    static url = "https://google.com"
    static at = { searchField.contains("asdas") }

    static content ={
       // pageTitle (${"head > title"})
        searchField {$("#lst-ib")}
    }

}
