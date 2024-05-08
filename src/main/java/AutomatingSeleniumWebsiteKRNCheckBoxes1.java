import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingSeleniumWebsiteKRNCheckBoxes1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().window().maximize();
		
		boolean checkBoxStatus = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBoxStatus);
		Thread.sleep(3000);
		
		driver.findElement(By.id("rep")).click();
		boolean checkBoxStatus1 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBoxStatus1);
		Thread.sleep(3000);
		
		driver.findElement(By.id("rep")).click();
		boolean checkBoxStatus2 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBoxStatus2);
		Thread.sleep(3000);
		
		driver.findElement(By.id("rep")).click();
		boolean checkBoxStatus3 = driver.findElement(By.id("rep")).isSelected();
		System.out.println(checkBoxStatus3);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
