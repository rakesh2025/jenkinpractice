package pompages;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.PropertiesFile;

public class Skillaryhomepage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillarydemobt;
	@FindBy(name="q")
	private WebElement searchtb;
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbt;
	
public Skillaryhomepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void gearsbutton() {
	gearsbtn.click();
}
public void Skillarydemoappbutton() {
	skillarydemobt.click();
}
public PropertiesFile pdata=new PropertiesFile();
public void searchTextBox() throws FileNotFoundException, IOException {
	searchtb.sendKeys(pdata.getdata("serch"));
}
}
