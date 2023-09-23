import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project_2_5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().window().setSize(new Dimension(1100,800));
		driver.get("https://automationexercise.com/");
		
		//REGIDTER BEFORE CHECKOUT
		
		
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("vk");
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("Renuka123@gmail.com");
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
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
		
		
		driver.findElement(By.xpath("/html/body/section/div/div[2]/span/p/a/u")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		
		
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[2]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("/html/body/section/div/div[7]/a")).click();

		driver.findElement(By.name("name_on_card")).sendKeys("pnj");
		driver.findElement(By.name("card_number")).sendKeys("xxx123479");
		driver.findElement(By.name("cvc")).sendKeys("311");
		driver.findElement(By.name("expiry_month")).sendKeys("04");
		driver.findElement(By.name("expiry_year")).sendKeys("2045");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		
		
	}

}
