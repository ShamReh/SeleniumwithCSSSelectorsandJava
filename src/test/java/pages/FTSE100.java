package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//POM
public class FTSE100 {

	public static final String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	@FindBy(id = "acceptCookieButton")
	private WebElement cookies;

	@FindBy(css = "li.one-line:nth-child(2) > a:nth-child(1) > strong:nth-child(1)")
	private WebElement risers;

	@FindBy(css = "li.one-line:nth-child(3) > a:nth-child(1) > strong:nth-child(1)")
	private WebElement fallers;

	public void cookies() {
		this.cookies.click();
	}

	public void goToRisers() {

		this.risers.click();
	}

	public void goToFallers() {
		this.fallers.click();
	}

}
