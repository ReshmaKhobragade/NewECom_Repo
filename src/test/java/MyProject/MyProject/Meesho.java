package MyProject.MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void MeeshoTest() throws InterruptedException 
  
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meesho.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
