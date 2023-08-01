package MyProject.MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra

{
  @Test
  public void MyntraTest()
  
 {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
  }
}
