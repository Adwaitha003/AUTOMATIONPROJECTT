package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addtocart {
	WebDriver driver;
	By women= By.xpath("//a[@href='https://www.glamly.com/collections/women']");
	By buy =By.xpath("//*[@id=\"8296035156197\"]/div/a/div/div/div[1]/img[2]");
	By bag=By.xpath("//span[@id='AddToCartText']");
	public addtocart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void shoping() {
		driver.findElement(women).click();
	}
	public void buying() {
		driver.findElement(buy).click();
	}
	public void purchase() {
		driver.findElement(bag).click();
	}
	}




