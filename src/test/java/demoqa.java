import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqa {
    @BeforeClass
    public static void demoone()
    {
        WebDriverManager.firefoxdriver().setup();
    }
   @Test
    public void demotwo()
   {
       WebDriver driver = new FirefoxDriver();
       String url = "https://shop.demoqa.com";
       driver.get(url);
       String title =  driver.getTitle();
       int titleLenth =  driver.getTitle().length();
       System.out.println("Title of URL:" + title);
       System.out.println("Length of URL:" + titleLenth);
       driver.quit();


   }
}
