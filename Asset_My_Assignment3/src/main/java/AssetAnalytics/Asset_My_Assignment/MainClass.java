package AssetAnalytics.Asset_My_Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
	
	

	

	public static void main(String[] args) throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\pranali project stuff\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://maximo-demo75.mro.com/maximo/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("maximo");
		
		driver.findElement(By.id("password")).sendKeys("maximo1");
		
		driver.findElement(By.id("loginbutton")).click();
		
		//WebDriverWait wait= new WebDriverWait(driver, 300);
		
		/*wait.until(ExpectedConditions.alertIsPresent());
		
	Alert alert= driver.switchTo().alert();
		
	alert.accept();*/
		
		driver.findElement(By.id("m7f8f3e49_ns_menu_ASSET_MODULE_a_tnode")).click();
		
		
		
		//wait.until(ExpectedConditions.visibilityOf((WebElement) (By.className("tundra.scBody"))));
		
		//driver.findElement(By.xpath("//ul[@id=\"m7f8f3e49_ns_menu_ASSET_MODULE_sub\"]"));
	
	driver.findElement(By.xpath("//td/ul/li[1]")).click();
	
	
	
	WebDriverWait wait= new WebDriverWait(driver, 15);
	
	WebElement button =driver.findElement(By.xpath("//input[@type='text'][4]"));
	
	button.click();
	
	Robot r=new Robot();
	
	WebElement button1 = driver.findElement(By.xpath("//input[@type='text'][4]"));
	//that new element will point to the same element in the new DOM
	button1.click();
	
	button1.sendKeys("");
	
	
	r.keyPress(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath("//td [@id=\"m6a7dfd2f_tdrow_[C:1]-c[R:0]\"]")).click();
	
	
	
		
		   
		        
	}
}
		   
		   
		 
		

		
		
		
		
		
		
	


