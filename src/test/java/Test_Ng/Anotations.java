package Test_Ng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Anotations {
    WebDriver driver;

    @BeforeTest
    public void firstToRun() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();      //it always runs before the  test no mather where you put
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void connectingToTheWebpage() {
        driver.get("https://www.google.com");
    }

    @AfterTest
    public void lastToRun()
    {
        driver.quit();            //it always runs after the test no mather where you put
    }
}
