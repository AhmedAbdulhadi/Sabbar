package common;

import org.openqa.selenium.WebDriver;

public class PageFactoryAbstract {

//    public PageFactoryAbstract()
//    {
//        this.setWebDriver(Browser.createInstance("CHROME"));
//    }

    private static WebDriver _driver;

    public WebDriver getWebDriver() {
        return _driver;
    }

    public void setWebDriver(WebDriver driver) {
        _driver = driver;
    }

    public void deleteAllDriverCookies()
    {
        getWebDriver().manage().deleteAllCookies();
    }

}
