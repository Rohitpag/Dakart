import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class herodrop {
    @BeforeClass
    public static void setupClass() {
        // WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Test
    public void checkdropdown()
    {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement menuOption = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuOption).perform();
        Assert.assertTrue(String.valueOf(true),menuOption.isDisplayed());

            driver.quit();



    }
}
