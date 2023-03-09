package MarathonSeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		String totalbags = driver.findElement(By.xpath("//span[text()='1-48 of over 40,000 results for']")).getText();
		String forboys = driver.findElement(By.xpath("//span[text()='\"bags for boys\"']")).getText();
		System.out.println(totalbags+forboys);
		driver.findElement(By.xpath("(//span[text()='Brand'])/following::li[1]")).click();
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		driver.findElement(By.xpath("//span[text()='Generic']")).click();
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String details = driver.findElement(By.xpath("(//span[text()='Generic'])[1]/following::a[1]")).getText();
		System.out.println(details);
		driver.findElement(By.xpath("(//span[text()='Generic'])[1]/following::a[1]")).click();
		String price = driver.findElement(By.xpath("(//span[contains(@class,'a-price-whole')])[4]")).getText();
		System.out.println(price+" is price of the bag");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		driver.close();
		
	}

}
