import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Forgot_email {

	public static void main(String[] args) throws InterruptedException {
		
		// Open chrome and go to google.com.
		String path = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/?hl=en");

		
		// click on signin button and go to forgot email.
		driver.findElement(By.xpath("//*[@id='gb_70']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@jsname=\"Cuz2Ue\" and @type=\"button\"]")).click();
		Thread.sleep(500);
		
		
		//get URl and verify URL is correct
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String expect_result = "/signin/v2/forgotemail";
		System.out.println(url.contains(expect_result));
		driver.quit();
		
	}

}
