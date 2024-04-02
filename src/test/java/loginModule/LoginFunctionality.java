package loginModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) throws InterruptedException {

		
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        //Navigate to the Url
        driver.get("https://www.raptorsupplies.com/login");
        
        WebElement usernameTextField = driver.findElement(By.id("email"));
        usernameTextField.sendKeys("shubsingh0298@gmail.com");
        
        WebElement passwordTextField = driver.findElement(By.id("pass"));
        passwordTextField.sendKeys("Abc@012345");
      
        Thread.sleep(2000);
        
       WebElement signIn = driver.findElement(By.name("send"));
       signIn.click();
       
       
	}

}
