package java_list;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class first_list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AL_Olaby\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://127.0.0.1:5500/index.html");
String Title = driver.getTitle();
List <WebElement> myFirstList = driver.findElements(By.tagName("option"));
for(int i=0; i<=myFirstList.size();i++) {
	
	System.out.println(myFirstList.get(i).getText());
	
}
	}
}
