package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fallers {

	@FindBy(css = ".\\{Sedol\\:\\'B1XZS82\\'\\}")
	private WebElement topFallers;

	public String getTopFaller() {
		return this.topFallers.getText();

	}
}
