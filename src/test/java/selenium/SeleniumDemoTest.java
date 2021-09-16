package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}

	@Test
	void demoTest() {
		this.driver.get("https://demoqa.com/text-box");
		WebElement userName = this.driver.findElementByCssSelector("#userName");
		userName.sendKeys("Sham");
		WebElement advert = this.driver.findElementByCssSelector("#close-fixedban > img");
		advert.click();
		WebElement email = this.driver.findElementByCssSelector("#userEmail");
		email.sendKeys("sr@sr.com");
		WebElement currentadd = this.driver.findElementByCssSelector("#currentAddress");
		currentadd.sendKeys("Address");
		WebElement permadd = this.driver.findElementByCssSelector("#permanentAddress");
		permadd.sendKeys("This is my home");
		this.driver.executeScript("window.scrollBy(0,350)", "");
		WebElement submitButton = this.driver.findElementByCssSelector("#submit");
		submitButton.click();

		WebElement name = this.driver.findElementByCssSelector("#name");
		assertEquals("Name:Sham", name.getText());
		WebElement mail = this.driver.findElementByCssSelector("#email");
		assertEquals("Email:sr@sr.com", mail.getText());
		WebElement add = this.driver.findElementByCssSelector("#output #currentAddress");
		assertEquals("Current Address :Address", add.getText());
		WebElement padd = this.driver.findElementByCssSelector("#output #permanentAddress");
		assertEquals("Permananet Address :This is my home", padd.getText());

	}

//	@AfterEach
//	void tearDown() {
//		this.driver.close();
//	}

}
