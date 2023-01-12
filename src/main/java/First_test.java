import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_test {public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://github.com/login");
	Thread.sleep(3000);
	driver.findElement(By.id("login_field"));
	Thread.sleep(3000);
	driver.findElement(By.className("form-control input-block js-login-field"));
	Thread.sleep(3000);
	driver.findElement(By.name("password"));
	driver.findElement(By.linkText("/password_reset"));
	driver.findElement(By.tagName("h1"));
	driver.findElement(By.xpath("//lable[contains(text().    Username or email address  )]"));
	driver.close();
	
		
}
}
