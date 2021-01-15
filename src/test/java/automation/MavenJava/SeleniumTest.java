package automation.MavenJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test(dataProvider = "empData", enabled=true) 
	public void empLogin(String username, String pw) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\govindarajs\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qatest.eschoolsolutions.com/");
		WebElement userid = driver.findElement(By.id("userId"));
		WebElement password = driver.findElement(By.id("userPin"));
		userid.sendKeys(username);
		password.sendKeys(pw);
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.id("dialog_close-button")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("sidious.prompt.header.signOut")).click();
		driver.quit();

	}

	@Test(dataProvider = "subData")
	public void subLogin(String username, String pw) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\govindarajs\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qatest.eschoolsolutions.com/");
		;
		WebElement userid = driver.findElement(By.id("userId"));
		WebElement password = driver.findElement(By.id("userPin"));
		userid.sendKeys(username);
		password.sendKeys(pw);
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.id("dialog_close-button")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("sidious.prompt.header.signOut")).click();
		driver.quit();

	}
	
	@Test(dataProvider = "adminData")
	public void adminLogin(String username, String pw) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\govindarajs\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qatest.eschoolsolutions.com/");
		;
		WebElement userid = driver.findElement(By.id("userId"));
		WebElement password = driver.findElement(By.id("userPin"));
		userid.sendKeys(username);
		password.sendKeys(pw);
		driver.findElement(By.id("submitBtn")).click();
		driver.findElement(By.id("dialog_close-button")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("sidious.prompt.header.signOut")).click();
		driver.quit();

	}

	@DataProvider
	public Object empData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "7003";
		data[0][1] = "Password@7003";
		return data;
	}

	@DataProvider
	public Object subData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "7012";
		data[0][1] = "Password@7010";
		return data;
	}
	
	@DataProvider
	public Object adminData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "7013";
		data[0][1] = "Password@7010";
		return data;
	}

}
