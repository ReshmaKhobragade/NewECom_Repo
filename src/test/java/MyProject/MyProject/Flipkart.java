package MyProject.MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void FlipkartTest() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Thread.sleep(3000);
	  driver.close();
  }
}
