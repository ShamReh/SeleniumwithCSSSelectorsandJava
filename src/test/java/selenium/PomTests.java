package selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.FTSE100;
import pages.Fallers;
import pages.Risers;

public class PomTests {

	private RemoteWebDriver driver;

	@BeforeEach
	void setup() {
		ChromeOptions opts = new ChromeOptions();
		opts.setHeadless(true);
		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
	}

	@Test
	void testRiserPOM() {

		FTSE100 home = PageFactory.initElements(driver, FTSE100.class);
		this.driver.get(FTSE100.URL);
		home.cookies();
		home.goToRisers();

		Risers topriser = PageFactory.initElements(driver, Risers.class);
		assertEquals("International Consolidated Airlines Group SA", topriser.getTopRiser());

	}

	@Test
	void testFallerPOM() {

		FTSE100 home = PageFactory.initElements(driver, FTSE100.class);
		this.driver.get(FTSE100.URL);
		home.cookies();
		home.goToFallers();

		Fallers topfaller = PageFactory.initElements(driver, Fallers.class);
		assertEquals("Anglo American", topfaller.getTopFaller());

	}

	@AfterEach
	void tearDown() {
		this.driver.close();
	}

}
