package CrossBrowsing;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class TestDemo 
{
	@Test
	public void titleCheck() throws MalformedURLException
	{
	
		MutableCapabilities caps = new MutableCapabilities();
		
	  //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.8:4444"), caps);
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
		
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().matches("Google"));
		driver.close();
		
	}
}
