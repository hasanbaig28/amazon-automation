package auto;


 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 

public class AmezonCamera {

	public static void main(String[] args) throws InterruptedException {
		 

		System.setProperty("webdriver.chrome.driver","E:\\browserdriver\\chrome D\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 
		WebElement searchinput = driver.findElement(By.id("twotabsearchtextbox"));
		searchinput.sendKeys("nikon camera");
		searchinput.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		WebElement temp = driver.findElement(By.linkText("Nikon Coolpix B500 Digital Camera (Black)"));
		temp.sendKeys(Keys.ENTER);
		System.out.println("testttttt"+temp);
		Thread.sleep(1000);
  		driver.close();
	
		
		
	}

}
