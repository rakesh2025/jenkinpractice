package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot implements AutoConstant {

	public void getphoto(WebDriver driver, String name) throws IOException 
	{
		Date d=new Date();
		String date = d.toString().replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(Photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
	}
}
