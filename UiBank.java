package own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UiBank {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("firstName")).sendKeys("Abilash");
		
		
		WebElement findElement = driver.findElement(By.id("title"));
		Select dd1 = new Select(findElement);
		dd1.selectByValue("mr");
		
		driver.findElement(By.id("lastName")).sendKeys("M");
		
		WebElement findElement2 = driver.findElement(By.name("gender"));
		Select dd2 = new Select(findElement2);
		dd2.selectByValue("male");
		
		WebElement findElement3 = driver.findElement(By.id("employmentStatus"));
		Select dd3 = new Select(findElement3);
		dd3.selectByValue("Full-time");
		
		driver.findElement(By.name("age")).sendKeys("04/12/2001");
		
		WebElement findElement4 = driver.findElement(By.id("maritalStatus"));
		Select dd4 = new Select(findElement4);
		dd4.selectByVisibleText("Single");
		
		
		driver.findElement(By.id("numberOfDependents")).sendKeys("1");
		driver.findElement(By.id("username")).sendKeys("abilash");
		driver.findElement(By.name("email")).sendKeys("abiabilash627@gmail.com");
		driver.findElement(By.name("password")).sendKeys("17052001");
		driver.findElement(By.xpath("//button[@class='btn btn-blue-outline form-button btn-xl']")).click();
		
	}
	

	}





