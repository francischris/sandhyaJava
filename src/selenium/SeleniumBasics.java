package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\caroline\\Desktop\\Sandhya\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\caroline\\Desktop\\Sandhya\\geckodriver.exe");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://www.google.com");

        Thread.sleep(5000l);

        webDriver.quit();



    }


}
