package util;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebConnector {
    public static WebConnector wcon = null;
    public WebDriver driver = null;
    public WebDriver mozilla = null;
    public WebDriver chrome = null;
    public WebDriver ie = null;
    public Properties config = null;

    private WebConnector() {
        try {
            if (config == null) {
                config = new Properties();
                FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
                config.load(fis);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("mozilla") && mozilla == null) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            mozilla = driver;
        } else if (browserType.equalsIgnoreCase("mozilla") && mozilla != null) {
            driver = mozilla;
        }
        if (browserType.equalsIgnoreCase("chrome") && chrome == null) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            chrome = driver;
        } else if (browserType.equalsIgnoreCase("chrome") && chrome != null) {
            driver = chrome;
        }
        if (browserType.equalsIgnoreCase("ie") && ie == null) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
            ie = driver;
        } else if (browserType.equalsIgnoreCase("ie") && ie != null) {
            driver = ie;
        }
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public HomePage openUrl(String url)
    {
        driver.get(url);
        return new HomePage();
    }
    public static WebConnector getInstance() {
        if (wcon == null)
            wcon = new WebConnector();
        return wcon;
    }

    public void close()
    {
        driver.quit();
    }

    public void takeScreenShot()
    {
        Date d=new Date();
        String screenShotFile=d.toString().replace(":","_").replace(" ","_")+".png";
        String filePath=PageConstants.REPORTS_PATH+screenShotFile;
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reportFailure(String failureMessage)
    {
        takeScreenShot();
        Assert.fail(failureMessage);

    }



}
