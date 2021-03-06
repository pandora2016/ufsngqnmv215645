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
		 driver.manage().window().maximize();

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

////
	
		 
//		 @Test
//		  public void testSubMenu() throws Exception {
		   // driver.get(baseUrl + "/menu/textured-responsive-drop-down-menu#");

		  //  driver.findElement(By.linkText("Registrar Tipos de Cambio")).click();
		 // }	 
//	       Actions actions = new Actions(driver);
//	       WebElement Mainmenu = driver.findElement(By.id("__AtJsMenu75__"));
//	       System.out.println("manu 1" +Mainmenu );
	       
	       
	       //ESPERAR ELEMENTO MENU
//			 WebElement myDynamicElement4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("__AtJsMenu78__")));

	       
	       
//	       WebElement Submenu = driver.findElement(By.id("__AtJsMenu78__"));
	       
//	       System.out.println("manu 1" +Submenu );
	       
	       
	       
	       //ESPERAR ELEMENTO MENU
//			 WebElement myDynamicElement5 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("__AtJsMenu84__")));

//			 WebElement Childsubmenu = driver.switchTo().activeElement();
			 
//	        Childsubmenu = driver.findElement(By.id("__AtJsMenu84__"));
//	        Childsubmenu.click();
	        
	        
//	       System.out.println("manu 1" +Childsubmenu );
	       
	       
	      
	  // actions.moveToElement(driver.findElement(By.id("__AtJsMenu75__"))).moveToElement(driver.findElement(By.id("__AtJsMenu78__"))).moveToElement(Childsubmenu1).click().build().perform();

		 //actions.
	   
	   
	        driver.findElement(By.id("__AtJsMenu75__")).click();
	      
		 
	//	 Actions builder = new Actions(driver);
	//	 WebElement menuLink = driver.findElement(By.id("__AtJsMenu75__"));		
		// WebElement subLink = driver.findElement(By.id("__AtJsMenu78__"));  
	// builder.moveToElement(menuLink).click();//.moveToElement(subLink).click().build().perform();


	       
	       
	       Actions actions1 = new Actions(driver);
	       WebElement menuHoverLink = driver.findElement(By.id("__AtJsMenuPopup3__"));
	       actions1.moveToElement(menuHoverLink);
	       
	       WebElement subLink = driver.findElement(By.id("__AtJsMenu78__"));
	       actions1.moveToElement(subLink);
	       
	       
	    //   WebElement menuHoverLink1 = driver.findElement(By.id("__AtJsMenu84__"));
	     //  actions1.moveToElement(menuHoverLink1);
	       
	       
	       actions1.click();
	       actions1.perform();
	       
	       //__AtJsMenuPopup5__  /  __AtJsMenu84__
	     
	    
	       //__AtJsMenu80__
	      // driver.findElement(By.id("__AtJsMenuPopup5__")).click();
	       
	      // Actions actions2 = new Actions(driver);
	       WebElement menuHoverLink1 = driver.findElement(By.id("__AtJsMenu84__"));
	       actions1.moveToElement(menuHoverLink1);
	       
	       /*WebElement subLink2 = driver.findElement(By.id("__AtJsMenu84__"));
	       actions2.moveToElement(subLink2);
	       actions2.click();
	       actions2.perform();	   
	       */
	     
	      // actions1.perform();
	       
	       
	 /*    
	       Actions actions = new Actions(driver);
	       WebElement menuHoverLink11 = driver.findElement(By.linkText("Menu heading"));
	       actions.moveToElement(menuHoverLink11);

	       WebElement subLink1 = driver.findElement(By.cssSelector("#headerMenu .subLink"));
	       actions.moveToElement(subLink1);
	       actions.click();
	       actions.perform();

	   */    
	       
	       
	       
	       
		// driver.quit();
		 }

	
	
	

}
