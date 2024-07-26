package Utilities;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	
public static void takeScreenshot(String stepName) throws IOException, HeadlessException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev");
	//	driver.findElement(By.linkText("See an example alert")).click();
		
		try {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String TCName = "TC_001";
		String dir = System.getProperty("user.dir");
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepName+"_"+timestamp+".jpeg";
		
		File destFile = new File (path);
		
		FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e) {
			
			BufferedImage Alertscreenshot = new Robot().createScreenCapture
					(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String TCName = "TC_001";
			String dir = System.getProperty("user.dir");
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepName+"_"+timestamp+".jpeg";
			
			ImageIO.write(Alertscreenshot, "png", new File (path));
		}
		
		
	}
	
	public static void main(String[] args) throws IOException, HeadlessException, AWTException {
		takeScreenshot("AlertPage");
	}

}
