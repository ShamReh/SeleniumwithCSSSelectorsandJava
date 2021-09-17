package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Risers {

	@FindBy(css = ".\\{Sedol\\:\\'B5M6XQ7\\'\\}")
	private WebElement topRiser;

	public String getTopRiser() {
		return this.topRiser.getText();

	}
}
