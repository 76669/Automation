
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_2_6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().setSize(new Dimension(1100,800));
		driver.get("https://automationexercise.com/");
		
		//LOGIN BEFORE CHECKOUT 
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
	    driver.findElement(By.name("email")).sendKeys("Renuka123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vz@1234");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
		
		JavascriptExecutor scr = (JavascriptExecutor)driver;
		scr.executeScript("window.scrollBy(0,870)");
		
		driver.findElement(By.xpath("/html/body/section/div/div[7]/a")).click();
		
     	driver.findElement(By.name("name_on_card")).sendKeys("pnj");
		driver.findElement(By.name("card_number")).sendKeys("xxx123479");
		driver.findElement(By.name("cvc")).sendKeys("311");
		driver.findElement(By.name("expiry_month")).sendKeys("04");
		driver.findElement(By.name("expiry_year")).sendKeys("2045");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();

		//VIEW CATOGERY PRODUCT
	
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[1]/h4/a")).click();
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[1]/h4/a")).click();
		
		
		
	    
	}

}
