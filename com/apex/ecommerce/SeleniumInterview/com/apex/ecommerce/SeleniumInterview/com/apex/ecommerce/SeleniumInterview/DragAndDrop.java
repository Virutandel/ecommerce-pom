import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement SourceElement = driver.findElement(By.id("draggable"));
		WebElement TargetElement = driver.findElement(By.id("draggable"));
		
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(SourceElement, TargetElement);
		
		
	  
  }
}
