package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach
	void setup() {
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.wait = new WebDriverWait(driver, 10);
	}

	@Test
	void demoTest() {
//		this.driver.get("https://demoqa.com/text-box");
//		WebElement userName = this.driver.findElementByCssSelector("#userName");
//		userName.sendKeys("Sham");
//		WebElement advert = this.driver.findElementByCssSelector("#close-fixedban > img");
//		advert.click();
//		WebElement email = this.driver.findElementByCssSelector("#userEmail");
//		email.sendKeys("sr@sr.com");
//		WebElement currentadd = this.driver.findElementByCssSelector("#currentAddress");
//		currentadd.sendKeys("Address");
//		WebElement permadd = this.driver.findElementByCssSelector("#permanentAddress");
//		permadd.sendKeys("This is my home");
//		this.driver.executeScript("window.scrollBy(0,350)", "");
//		WebElement submitButton = this.driver.findElementByCssSelector("#submit");
//		submitButton.click();

//		WebElement name = this.driver.findElementByCssSelector("#name");
//		assertEquals("Name:Sham", name.getText());
//		WebElement mail = this.driver.findElementByCssSelector("#email");
//		assertEquals("Email:sr@sr.com", mail.getText());
//		WebElement add = this.driver.findElementByCssSelector("#output #currentAddress");
//		assertEquals("Current Address :Address", add.getText());
//		WebElement padd = this.driver.findElementByCssSelector("#output #permanentAddress");
//		assertEquals("Permananet Address :This is my home", padd.getText());

		this.driver.get("http://automationpractice.com/index.php");
		WebElement searchBar = this.driver.findElementByCssSelector("#search_query_top");
		searchBar.sendKeys("Dress");
		searchBar.sendKeys(Keys.ENTER);
		WebElement summer = this.driver.findElementByCssSelector(
				"li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h5:nth-child(1) > a:nth-child(1)");
		summer.click();
		WebElement description = this.driver.findElementByCssSelector("#short_description_content > p:nth-child(1)");
		assertEquals(
				"Long printed dress with thin adjustable straps. V-neckline and wiring under the bust with ruffles at the bottom of the dress.",
				description.getText());
		WebElement addToCart = this.driver.findElementByCssSelector("button.exclusive > span:nth-child(1)");
		addToCart.click();
		WebElement proceed = this.driver.findElementByCssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
		this.wait.until(ExpectedConditions.textToBePresentInElement(proceed, "Proceed to checkout"));
		proceed.click();
		this.driver.executeScript("window.scrollBy(0,350)", "");
		WebElement checkout = this.driver.findElementByCssSelector(".standard-checkout > span:nth-child(1)");
		checkout.click();
		WebElement email = this.driver.findElementByCssSelector("#email");
		email.sendKeys("sr.166@hotmail.co.uk");
		WebElement password = this.driver.findElementByCssSelector("#passwd");
		password.sendKeys("password");
		password.sendKeys(Keys.ENTER);
		WebElement continuecheck = this.driver
				.findElementByCssSelector("button.button:nth-child(4) > span:nth-child(1)");
		continuecheck.click();
		WebElement terms = this.driver.findElementByCssSelector("#cgv");
		terms.click();
		WebElement proceed2 = this.driver.findElementByCssSelector("button.button:nth-child(4) > span:nth-child(1)");
		proceed2.click();
		WebElement payment = this.driver.findElementByCssSelector(".bankwire");
		payment.click();
		WebElement confirm = this.driver.findElementByCssSelector("button.button-medium > span:nth-child(1)");
		confirm.click();

	}

//	@AfterEach
//	void tearDown() {
//		this.driver.close();
//	}

}
