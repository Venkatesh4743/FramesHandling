package FramesHanding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class FramesHandling {
	 public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    
 // Find the element with ID "name" and enter "Text 1" into it
    driver.findElement(By.id("name")).sendKeys("Text 1");

    // Switch to the frame with ID "frm1"
    driver.switchTo().frame("frm1");

    // Find the element with ID "course" inside the frame and store it in a WebElement variable
    WebElement courseElement = driver.findElement(By.id("course"));

    // Create a Select object using the previously found WebElement
    Select courseNameDropdown = new Select(courseElement);

    // Select the option "Java" from the dropdown
    courseNameDropdown.selectByVisibleText("Java");

    // Switch back to the default content (main page, outside the frame)
    driver.switchTo().defaultContent();

    // Find the element with ID "name" again (outside the frame) and enter "Text 2" into it
    driver.findElement(By.id("name")).sendKeys("Text 2");


}
}

