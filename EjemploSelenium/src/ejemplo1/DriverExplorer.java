package ejemplo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverExplorer {
	
	public static void main(String[] args) {
		 
		   
		 
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();	 
		 capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);	 
		 System.setProperty("webdriver.ie.driver", "D:\\Programacion_libre\\Librerias\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver(capabilities);
		// driver.manage().window().maximize();

		 driver.get("https://scvluxn2.cavali.com.pe:4445/Cavalipre/menusess.do?op=showMenuSession");
		 driver.navigate().to("javascript:document.getElementById('overridelink').click()");

		 driver.navigate().to("javascript:document.getElementById('btnLogin').onclick()");
		 
		 driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		 driver.switchTo().alert().accept();  
		 
		 /// Prueba de login
	     // esperar el elemento cargarse por completo
		 WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("ssousername")));

		 // iniciar proceso de logueo
		 driver.findElement(By.id("ssousername")).sendKeys("ISIS$RQC");
		 driver.findElement(By.id("txtUs1erName")).sendKeys("WARI2015");
		 driver.findElement(By.id("btnAceptar")).click();
		 
		 /// Fin de login
		 
		// driver.findElement(By.xpath("//input[@id='Ingresar']")).click();// - See more at: http://software-testing-tutorials-automation.blogspot.pe/2015/02/how-to-wait-for-page-to-loadready-in.html#sthash.iUqqOwVO.dpuf
		
		 WebElement myDynamicElement2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Ingresar")));
		 driver.findElement(By.linkText("Ingresar")).click();    
		 
		 //ESPERAR ELEMENTO MENU
		 WebElement myDynamicElement3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("__AtJsMenu75__")));

		
		// driver.findElement(By.id("__AtJsMenu75__")).click();
		 
		 
		 
		// driver.navigate().to("javascript:document.getElementById('btnLogin').onclick()");
		 
		 
		 Actions builder = new Actions(driver);
		WebElement menuLink = driver.findElement(By.id("__AtJsMenu75__"));		
		 WebElement subLink = driver.findElement(By.id("__AtJsMenu78__"));  
		 builder.moveToElement(menuLink).click().moveToElement(subLink).click().build().perform();
		// builder.moveToElement(menuLink).click().moveToElement(subLink).moveToElement(subLink2).click().build().perform();
		  // driver.findElement(By.id("__AtJsMenu84__")).click();
		 //driver.findElement(By.tagName("Registrar Tipos de Cambio")).click();

		// driver.findElement(By.id("__AtJsMenu75__")).click();
		// driver.findElement(By.xpath("//input[@id='__AtJsMenu84__']")).click();
		// driver.findElement(By.id("__AtJsMenu78__")).click();
		// driver.findElement(By.id("__AtJsMenu84__")).click();

		// driver.quit();
		 }


}
