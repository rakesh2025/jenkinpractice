package skillaryAutomation;





import java.io.FileNotFoundException;
import java.io.IOException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.Baseclass;
import pompages.Addtocartpage;
import pompages.Skilarydemohome;
import pompages.Skillaryhomepage;

public class Addtocart extends Baseclass {
@Test
public void tc1() throws InterruptedException, FileNotFoundException, IOException {
	Skillaryhomepage s=new Skillaryhomepage(driver);
	s.gearsbutton();
	s.Skillarydemoappbutton();
	
	utilies.switchTabs(driver);
	Skilarydemohome d=new Skilarydemohome(driver);
	utilies.mousehover(driver,d.getCoursebt());
	d.seleniumtrainingbutton();
	
	Addtocartpage a=new Addtocartpage(driver);
	utilies.doubleClick(driver, a.getAddbtn());
	a.addtocartbutton();
	
	utilies.alertpopup(driver);
	Thread.sleep(5000);
	Assert.assertEquals(driver.getTitle(), pdata.getdata("title"));
	Reporter.log(driver.getTitle(), true);
}
}
