import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_2_7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().setSize(new Dimension(1100,800));
		driver.get("https://automationexercise.com/");
		
		//SEARCH PRODUCT AND VERIFY CART AFTER LOGIN
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("search_product")).sendKeys("Top");
		JavascriptExecutor scr = (JavascriptExecutor)driver;
		scr.executeScript("window.scrollBy(0,400)");
    	driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("pqrs123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pqrs123");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
		
		//ADD REVIEW ON PRODUCT
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		sc.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		
		JavascriptExecutor sci = (JavascriptExecutor)driver;
		sci.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.id("name")).sendKeys("abc");
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("review")).sendKeys("nice qaulity");
		driver.findElement(By.id("button-review")).click();
		
	}

}
