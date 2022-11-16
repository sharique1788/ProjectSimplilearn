import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApplicationtest {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

WebDriver amzn=new ChromeDriver();

amzn.get("https://www.amazon.in");
amzn.manage().window().maximize();

WebElement searchProduct=amzn.findElement(By.id("twotabsearchtextbox"));
WebElement search=amzn.findElement(By.id("nav-search-submit-button"));

searchProduct.sendKeys("Android Mobile");
search.click();

	}

}
