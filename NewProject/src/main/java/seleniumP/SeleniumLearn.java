package seleniumP;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLearn {

		public static void main(String[] args) {

         // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
      
        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\geckodriver.exe");
        //  WebDriver driver = new FirefoxDriver();
            
            
      	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\msedgedriver.exe");
		//  WebDriver driver = new EdgeDriver();
			
            driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com");
	        System.out.println(driver.getTitle());
	        System.out.println(driver.getCurrentUrl());
	        driver.close(); //Close the current window, quitting the browser if it's the last window currently open.
	        driver.quit(); //Quits this driver, closing every associated window.
	        
		}

	}