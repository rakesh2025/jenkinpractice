package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Skilarydemohome 
{
	@FindBy(id="course")
	private WebElement coursebt;
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtranbt;
	
public Skilarydemohome(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void seleniumtrainingbutton() {
	seleniumtranbt.click();
}

public WebElement getCoursebt() {
	return coursebt;
}
}
