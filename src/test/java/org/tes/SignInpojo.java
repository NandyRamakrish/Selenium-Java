package org.tes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpojo extends BaseClasss {
	public SignInpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement Createnewaccountbox;
	@FindBy(name = "firstname")
	private WebElement firstnamebox;
	@FindBy(name = "lastname")
	private WebElement lastnamebox;
	@FindBy(name = "reg_email__")
	private WebElement regemailbox;
	@FindBy(name = "reg_passwd__")
	private WebElement passwordbox;
	public WebElement getCreatenewaccountbox() {
		return Createnewaccountbox;
	}
	public WebElement getFirstnamebox() {
		return firstnamebox;
	}
	public WebElement getLastnamebox() {
		return lastnamebox;
	}
	public WebElement getRegemailbox() {
		return regemailbox;
	}
	public WebElement getPasswordbox() {
		return passwordbox;
	}

}
