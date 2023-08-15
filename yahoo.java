package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo 
{
			public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");// link
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vbhat9141@yahoo.com");//mail_id
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-signin']")).click();//next
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("9141Vish");//password
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();//login
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@role='button']")).click();//compose
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("bhatsharvari30609@gmail.com");//to 
			driver.findElement(By.xpath("//input[@spellcheck='true']")).sendKeys("Nalayak");
			driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hello WACHA");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@title='Send this email']")).click();

		}

	


}
