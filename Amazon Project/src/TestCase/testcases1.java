package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcases1  
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Wrist Watches"); 
        
        WebElement searchButton = driver.findElement(By.className("nav-search-submit-text"));
        searchButton.click();

        WebElement analogueFilter = driver.findElement(By.xpath("//li[@aria-label='Analogue']"));
        analogueFilter.click();

        WebElement leatherMaterialFilter = driver.findElement(By.xpath("//li[@aria-label='Leather']"));
        leatherMaterialFilter.click();

        WebElement titanBrandFilter = driver.findElement(By.xpath("//span[contains(text(),'Titan')]"));
        titanBrandFilter.click();

        WebElement discountFilter = driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]"));
        discountFilter.click();

        WebElement fifthElement = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[5]"));
        System.out.println("Fifth Element: " + fifthElement.getText());

        driver.quit();
      
        

		
		
		
		
       
	}

}
