package seleniumMKT_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeDriver driver=new ChromeDriver();	
		driver.get("https://letcode.in/dropdowns?utm_source=chatgpt.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w1=	driver.findElement(By.xpath("//select[@id='fruits']"));
		w1.click();
		Select s1 = new Select(w1);
		//s1.selectByValue("value=2");
		
		s1.selectByContainsVisibleText("Orange");
		Thread.sleep(3000);
		s1.selectByIndex(5);
		
}
}
