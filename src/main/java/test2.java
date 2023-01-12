import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class test2 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernametxt=driver.findElement(By.id("login_field"));
		if(usernametxt.isDisplayed()){
			if(usernametxt.isEnabled()) {
				usernametxt.sendKeys("balaramchitti");
				Thread.sleep(5000);
				usernametxt.clear();
				}else 
					System.out.println("usernametxt is not Displayed");
				
		}else 
			System.out.println("usernametxt is  not Displayed");
		
	}
}

		
		
		
		
		


