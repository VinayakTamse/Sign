package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static FileInputStream file;
	public static Properties props;
	private String propPath=System.getProperty("user.dir") + "\\src\\test\\java\\Confi.properties";
	public static WebDriver driver;
	//public static String ImgPath=System.getProperty("user.dir") + "\\src\\Images\\LoginLink.JPG";
	
	public TestBase() 	{
		try {
			file = new FileInputStream(propPath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		props = new Properties();
		try {
			props.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void Initialisation()	{
		String browser = props.getProperty("Browser");
		if (browser.equalsIgnoreCase("chrome"))	{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(props.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}

}
