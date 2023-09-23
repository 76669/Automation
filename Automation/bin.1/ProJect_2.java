import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.javascriptExcutor;

public class  ProJect_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1000,700));
		driver.get("https://automationexercise.com/");

		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		//REGISTER
		
		driver.findElement(By.name("name")).sendKeys("vk");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("AB134@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.name("title")).click();
		driver.findElement(By.name("password")).sendKeys("vz@1234");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div"));
		
	    driver.findElement(By.name("first_name")).sendKeys("abc");
        driver.findElement(By.name("last_name")).sendKeys("xyz");
		driver.findElement(By.name("company")).sendKeys("pk");
		driver.findElement(By.name("address1")).sendKeys("om road");
		driver.findElement(By.name("state")).sendKeys("UP");
		driver.findElement(By.name("city")).sendKeys("Bihar");
		driver.findElement(By.name("zipcode")).sendKeys("111222");
		driver.findElement(By.name("mobile_number")).sendKeys("1234567899");
		
		JavascriptExecutor scr = (JavascriptExecutor)driver;
		scr.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
		//image
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		//LOGIN(CORRECT EMAIL AND PASSWORD)
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
		driver.findElement(By.name("email")).sendKeys("vhk01234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vhk@01234");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		//LOGIN(INCORRECT EMAIL AND PASSWORD)
		
		driver.findElement(By.name("email")).sendKeys("vjk01234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vhk@0134");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		
		
		
		
	}

}
