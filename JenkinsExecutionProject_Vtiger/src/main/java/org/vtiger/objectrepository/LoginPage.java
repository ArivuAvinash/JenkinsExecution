package org.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath ="//input[@name='user_name']" )
private WebElement usernameTextFiled;
@FindBy(xpath ="//input[@name='user_password']")
private WebElement passswordTextField;
@FindBy(id = "submitButton")
private WebElement submitButton;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getUsernameTextFiled() {
	return usernameTextFiled;
}
public WebElement getPassswordTextField() {
	return passswordTextField;
}
public WebElement getSubmitButton() {
	return submitButton;
}

}
