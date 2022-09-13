import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoone {
        //This method will run once before all of the tests in our class
        @BeforeClass
        public static void setupClass() {
           // WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        }
        @Test
        public void smarterTest()
        {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
            driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
            driver.findElement(By.cssSelector("#login-button")).click();

            driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
            driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();

            driver.findElement(By.id("first-name")).sendKeys("Rick");
            driver.findElement(By.id("last-name")).sendKeys("Ross");
            driver.findElement(By.id("postal-code")).sendKeys("421004");
            driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

            driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

            Assert.assertTrue(driver.findElement(By.cssSelector(".title")).isDisplayed());

            driver.quit();
        }
    }


