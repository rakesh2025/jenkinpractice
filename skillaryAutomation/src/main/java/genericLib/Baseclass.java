package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
 public WebDriver driver;
public PropertiesFile pdata=new PropertiesFile();
public WebDiverutilities utilies=new WebDiverutilities();

@BeforeMethod
public void openapp() throws FileNotFoundException, IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getdata("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@AfterMethod
public void closeapp(ITestResult res) throws IOException {
	int status = res.getStatus();
	String name = res.getName();
	if(status==2) {
		Screenshot s=new Screenshot();
		s.getphoto(driver,name);
		}
	driver.quit();
}
}
