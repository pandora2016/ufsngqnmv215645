package ejemplo1;



import org.eclipse.jetty.websocket.api.InvalidWebSocketException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class emplo1  {
    public static void main(String[] args) throws InterruptedException 
    {
    	
    	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    	caps.setCapability("ignoreZoomSetting", true);
    	caps.setCapability("nativeEvents",false);
    	
    	System.setProperty("webdriver.ie.driver", "D:\\Programacion_libre\\Librerias\\IEDriverServer.exe");
    	
    	WebDriver driver = new InternetExplorerDriver(caps);

    	
    	
    
    	
    	
    	driver.get("https://scvluxn2.cavali.com.pe:4445/Cavalipre/jsp/sessionexpiryframe.jsp");
    //	driver.manage().window().maximize();
    	
    
    	//WebElement element = driver.findElement(By.partialLinkText("continueToSiteAlign"));
    	//element.Click();
    	//driver.wait(100);
    	
    	    	
    	System.out.println(driver.findElement(By.linkText("Vaya a este sitio web (no recomendado)")));
    	System.out.println(driver.findElement(By.id("overridelink")));
    	

    }
    
}

