package ejemplo1;


	
	
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;
	public class MySpiceJet {

	    
	    public static void main(String[] args) throws Exception
	    {
	        WebDriver wd=new FirefoxDriver();
	        wd.get("http://www.spicejet.com/");
	        Thread.sleep(10000);
	        
	        WebElement from1=wd.findElement(By.id("from1Select"));
	        // Get the list from the drop down list Selenium WebDriver
	        List<WebElement> list1=from1.findElements(By.tagName("option"));
	        for(WebElement i:list1)
	        {
	            System.out.println(i.getText());
	            //Reporter.log(i.getText());
	        } 
	            // Select a value from the drop down list Selenium WebDriver
	            Select select=new Select(wd.findElement(By.id("from1Select")));
	            select.selectByVisibleText("Tirupati");   

	        wd.close();
	    }

}
