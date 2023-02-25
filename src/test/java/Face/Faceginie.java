package Face;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Faceginie {

		public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facegenie-ams-school.web.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		// Login Page
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("password")).sendKeys("testing@123");
		driver.findElement(By.className("MuiButton-root")).click();
		
		//Manage Students
		
		driver.findElement(By.xpath("//div[@role='button'][4]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'MuiGrid-root css-1ceokph')]//button[contains(@type,'button')]")).click();
		driver.findElement(By.name("admissionNo")).sendKeys("1001");
		driver.findElement(By.name("firstName")).sendKeys("Ram");
		driver.findElement(By.name("lastName")).sendKeys("Yadav");
		driver.findElement(By.xpath("//input[@placeholder='Father Name']")).sendKeys("Mukesh");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[5]")).click();
		driver.findElement(By.xpath("//li[normalize-space()='CLASS 4']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[6]")).click();
		driver.findElement(By.xpath("//li[@data-value='A']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[7]")).click();
		driver.findElement(By.xpath("//li[@data-value='M']")).click();
		driver.findElement(By.name("mobileNo")).sendKeys("9874563210");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[8]")).click();
		driver.findElement(By.xpath("//li[@data-value='BUS NO 43']")).click();
		driver.findElement(By.id("date")).sendKeys("10-02-2012");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[9]")).click();
		driver.findElement(By.xpath("//li[@data-value='Yes']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[10]")).click();
		driver.findElement(By.xpath("//li[@data-value='Yes']")).click();
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[11]")).click();
		driver.findElement(By.xpath("//li[@data-value='Area 1']")).click();
		driver.findElement(By.name("address")).sendKeys("Pune");
		driver.findElement(By.name("studentId")).sendKeys("ID-001");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[12]")).click();
		driver.findElement(By.xpath("//li[@data-value='Studying']")).click();
		driver.findElement(By.id("date")).sendKeys("10-02-2018");
		driver.findElement(By.name("motherName")).sendKeys("Savita");
		driver.findElement(By.name("motherMobileNo")).sendKeys("7896542025");
		driver.findElement(By.xpath("(//div[@id='demo-simple-select-helper'])[13]")).click();
		driver.findElement(By.xpath("//li[@data-value='Hostel']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Logout
		
	    driver.findElement(By.xpath("//div[@role='button'][7]")).click();
	    driver.findElement(By.xpath("(//button[normalize-space()='Ok'])[1]")).click();
		
	      
		
		
		}
}


