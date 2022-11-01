package own;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matrimony {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select dd1 = new Select(findElement);
		dd1.selectByValue("1");
		
		driver.findElement(By.id("NAME")).sendKeys("abilash");
		driver.findElement(By.id("gendermale")).click();
		
		
		WebElement DOBDAY=driver.findElement(By.id("DOBDAY"));
		Select dd2=new Select(DOBDAY);
		dd2.selectByValue("17");
		
		WebElement DOBMONTH =driver.findElement(By.id("DOBMONTH"));
		Select dd3=new Select(DOBMONTH);
		dd3.selectByValue("5");
		
		WebElement DOBYEAR =driver.findElement(By.id("DOBYEAR"));
		Select dd4=new Select(DOBYEAR);
		dd4.selectByValue("2001");
		
		WebElement RELIGION=driver.findElement(By.id("RELIGION"));
		Select dd5=new Select(RELIGION);
		dd5.selectByValue("1");
		
		WebElement MOTHERTONGUE=driver.findElement(By.id("MOTHERTONGUE"));
		Select dd6=new Select(MOTHERTONGUE);
		dd6.selectByValue("47");
		
		WebElement CASTE_NORMAL=driver.findElement(By.id("CASTE_NORMAL"));
		Select dd7=new Select(CASTE_NORMAL);
		dd7.selectByValue("3");
		
		WebElement COUNTRY=driver.findElement(By.id("COUNTRY"));
		Select dd8=new Select(COUNTRY);
		dd8.selectByValue("39");
		
		WebElement M_COUNTRYCODE=driver.findElement(By.id("M_COUNTRYCODE"));
		Select dd9=new Select(M_COUNTRYCODE);
		dd9.selectByValue("98");
		
		
		driver.findElement(By.id("MOBILENO")).sendKeys("6381616295");
		driver.findElement(By.id("EMAIL")).sendKeys("abiabilash627@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("abilash1705");
		
		
		
		
		
		
		
		
		
	}

}
