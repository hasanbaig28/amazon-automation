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
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElementByName("email");
		username.sendKeys("9640672105");
		username.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement pass = driver.findElementById("ap_password");
		pass.sendKeys("Hasan007*");
		pass.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement searchinput = driver.findElement(By.id("twotabsearchtextbox"));
		searchinput.sendKeys("nikon camera");
		searchinput.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		WebElement temp = driver.findElement(By.linkText("Nikon D3500 DX-Format DSLR Two Lens Kit with AF-P DX Nikkor 18-55mm f/3.5-5.6G VR & AF-P DX Nikkor 70-300mm f/4.5-6.3G ED (Black)"));
		temp.sendKeys(Keys.ENTER);
		System.out.println("testttttt"+temp);
		Thread.sleep(1000);
  		driver.close();
	
		
		
	}

}
