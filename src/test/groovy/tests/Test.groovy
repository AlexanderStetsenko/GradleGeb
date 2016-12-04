package tests

import pages.MyPage


/**
 * Created by St on 03.12.2016.
 */
class Test extends BaseTest{



    @org.junit.Test
    public void firstTest() throws Exception {

        to MyPage
        searchField << "xxx"

        at(MyPage)
    }

    @org.junit.Test
    public void secondTest() throws Exception {

        to MyPage
        searchField << "xxx"
        at(MyPage)



    }
}
