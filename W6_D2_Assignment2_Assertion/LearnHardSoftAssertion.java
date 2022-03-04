package week6.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnHardSoftAssertion{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Contacts")).isDisplayed());
		System.out.println("Hard Assertion Executed");
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("venkatesh");
        driver.findElement(By.id("lastNameField")).sendKeys("Ravi");
	    driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    System.out.println("First name = "+text+"   "+"Browser Title = "+driver.getTitle());
	    
	    SoftAssert sa= new SoftAssert();
	    sa.assertEquals(text,"venkatesh");
	    System.out.println("Soft Assertion Executed");
	    driver.close();
	
	}
}
