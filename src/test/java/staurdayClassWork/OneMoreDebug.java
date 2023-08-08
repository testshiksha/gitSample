package staurdayClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreDebug {

	public static void main(String[] args) {
 
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php");
		
		//step3---adding credential 
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			DebugStaticFile.maximize(driver);

	}

}
