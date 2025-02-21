package seleniumP;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag static
      WebElement staticDropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      
       Select dropdown = new Select(staticDropdown);
       dropdown.selectByIndex(3); //by index
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("AED"); // by visible text
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByValue("INR"); //by attribute value
       System.out.println(dropdown.getFirstSelectedOption().getText());
       driver.findElement(By.id("divpaxinfo")).click();
       Thread.sleep(2000);
       
       // we can click on button multiple times using loop
//       int i=1;
//       while(i<5)
//       {
//    	   driver.findElement(By.id("hrefIncAdt")).click();
//    	   i++;
//       }
       
       for(int i=1; i<5; i++) //4times
       {
    	   driver.findElement(By.id("hrefIncAdt")).click();
       }
       
       for(int i=0; i<2; i++) //2 times
       {
    	   driver.findElement(By.id("hrefIncChd")).click();
       }
       
    	   driver.findElement(By.id("hrefIncInf")).click(); //1 time
       
       
       driver.findElement(By.id("btnclosepaxoption")).click();
       Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 2 Child, 1 Infant");
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


       
       
	}

}
