package pompages;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreSeleniumpage {
@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbt;
@FindBy(xpath="//button[@class='play rounded-box state-playing']")
private WebElement pausebt;
@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
private WebElement takecrs;

public CoreSeleniumpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void playButton() {
	playbt.click();
}
public void pauseButton() {
	pausebt.click();
}
public void takeCourse() {
}
}
