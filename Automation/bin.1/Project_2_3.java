
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_2_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().setSize(new Dimension(1100,800));
		driver.get("https://automationexercise.com/");
		
		//PRODUCT PAGE
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("search")).sendKeys("top");
	 	driver.findElement(By.id("submit_search")).click();
		
	  	// VERIFY SUBSCRIPTION IN HOME PAGE
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,920)");
		
	  	driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.id("susbscribe_email")).sendKeys("vhk01234@gmail.com");
		driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/form/button/i")).click();
		
		// VERIFY SUBSCRIPTION IN CARD PAGE 
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("susbscribe_email")).sendKeys("vhk01234@gmail.com");
		driver.findElement(By.id("subscribe")).click();

		// ADD PRODUCTS IN CARD
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();   
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[2]/ul/li/a")).click();
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[2]/a/u")).click();


	}

}
