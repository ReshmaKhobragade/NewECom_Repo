package MyProject.MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void MeeshoTest() 
  
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.meesho.com/");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.close();
	  
  }
}
