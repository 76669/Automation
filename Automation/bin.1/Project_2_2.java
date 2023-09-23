import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_2_2 {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
		    driver.manage().window().setSize(new Dimension(1000,800));
			driver.get("https://automationexercise.com/");
			
			
			//LOGOUT USER
			driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
			

			driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
			driver.findElement(By.name("email")).sendKeys("vhk01234@gmail.com");
			driver.findElement(By.name("password")).sendKeys("vhk@01234");
			driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
			driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
			
			//EMAIL ALREDAY EXIST
			
			driver.findElement(By.name("name")).sendKeys("vk");
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("vy134@gmail.com");
			driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
			
			//CONTACT US
			
			driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")).click();
		    driver.findElement(By.name("name")).sendKeys("vk");
			driver.findElement(By.name("email")).sendKeys("vhk01234@gmail.com");
			driver.findElement(By.name("subject")).sendKeys("exchange");
			driver.findElement(By.name("message")).sendKeys("Not Good Qaulity");
			driver.findElement(By.name("submit")).click();
			
			Alert alert=driver.switchTo().alert();
	          alert.accept();
			
			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/a/span")).click();

			//TEST CASE PAGE
			driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();
			
			
	}

}
