import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/"); // get the youTube link
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.trawell.in/andhra/araku-valley/tyda-nature-camp");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle()); // Printing Title
	}

}
