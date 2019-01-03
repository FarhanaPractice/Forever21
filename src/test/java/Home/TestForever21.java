package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestForever21 {
    WebDriver driver=null;
      @BeforeMethod
    public void setup() {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\farha\\Documents\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          driver.manage().deleteAllCookies();
          driver.manage().window().fullscreen();
          driver.get("https://www.forever21.com");

      }
      @Test
      public void clickOnSearchTest(){
          driver.findElement(By.id("ihKeyword")).sendKeys("womens dress");
      }
      @Test
      public void clickOnWomenTest(){
          driver.findElement(By.className("ls_2px")).click();
      }
      @Test
      public void clickOnLoveTest(){
          driver.findElement(By.className("top_new_wishlist")).click();
      }
      @Test
      public void clickOnUSAFlag(){
          driver.findElement(By.className("top_new_flag_us vb")).click();
      }




      @AfterMethod
    public void tearDown() {
          driver.close();

      }

}
