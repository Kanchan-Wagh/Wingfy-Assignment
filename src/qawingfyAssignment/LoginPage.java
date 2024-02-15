package qawingfyAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kanchanwagh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"log-in\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[5]")).click();
		

	}

}
