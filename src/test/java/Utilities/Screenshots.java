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
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	

//	public static String takeScreenshot(WebDriver driver, String screenshotName) {
//        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        
//        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
//        
//        String destFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\" + screenshotName + "_" + timestamp + ".png";
//        
//        File destFile = new File(destFilePath);
//        
//        try {
//            FileUtils.copyFile(srcFile, destFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return destFilePath;
//    }
//	
}
