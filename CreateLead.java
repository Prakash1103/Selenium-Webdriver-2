package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String Text= driver.findElement(By.tagName("h2")).getText();
		System.out.println(Text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("info");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praveen");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select d1=new Select(dropdown1);
		d1.selectByVisibleText("Employee");
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select d2=new Select(dropdown2);
		d2.selectByVisibleText("Automobile");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/08/1999");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500");
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select d3=new Select(dropdown3);
		d3.selectByIndex(3);
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select d4=new Select(dropdown4);
		d4.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("praveenkumar150@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6282363879");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Praveen kumar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ashok nagar 18th street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("5th avenue");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600083");
		WebElement dropdown5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select d5=new Select(dropdown5);
		d5.selectByValue("IND");
		WebElement dropdown6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select d6=new Select(dropdown6);
		d6.selectByValue("IN-TN");
		driver.findElement(By.className("smallSubmit")).click();
		String Title1=driver.getTitle();
		System.out.println(Title1);
		String firstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
		
		
		
		
	
		

	}

}
