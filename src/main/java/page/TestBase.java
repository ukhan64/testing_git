package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	
	public static void init () 
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe" );
		driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
	}
	
//	public void takescreenshot (WebDriver driver) throws IOException {
//		TakesScreenshot td= (TakesScreenshot) driver;
//		File sourceFile= td.getScreenshotAs(OutputType.FILE);
//		String currentdirectory=System.getProperty("user.dir");
//		FileUtils.copyFile(sourceFile, new File(currentdirectory +"/screenshot/"+System.currentTimeMillis()+ ".png"));
//	}
//	
//	public void takescreenshot (WebDriver driver) {
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
//		String currentdirectory= System.getProperty("user.dir");
//		try {
//			FileUtils.copyFile(sourcefile, new File (currentdirectory + "/screenshot/" +System.currentTimeMillis()+ ".png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public void takescreenshot (WebDriver driver) {
//		TakesScreenshot ts= (TakesScreenshot) driver;
//	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//	String currentdirectory= System.getProperty("user.dir");
//	try {
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//		Date date= new Date();
//		String label= formatter.format(date);
//		FileUtils.copyFile(sourcefile, new File(currentdirectory +  "/screenshot/" + label + ".png"));
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
	public void takescreenshot (WebDriver driver) throws Exception {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
		String currentdirectory= System.getProperty("user.dir");
		SimpleDateFormat formatter= new SimpleDateFormat("MMddyy_HHmmss");
		Date date= new Date();
		String datefor= formatter.format(date);
		FileUtils.copyFile(sourcefile, new File(currentdirectory + "/screenshot/" + datefor + ".png") );
	}
	}
	
	
	
	


