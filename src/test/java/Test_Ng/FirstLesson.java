package Test_Ng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstLesson {

    @Test
    public void basarılımailtest()
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("bu basarılı mail testidir");
        driver.close();
    }

    @Test
    public void basarısızmailtest()
    {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("bu basarısız mail testidir");
        driver.close();
    }
}
