package org.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
@FindBy (xpath = "//img[@title='Create Contact...']")
private WebElement createContactsButton;
@FindBy(id= "dtlview_First Name")
private WebElement firstNameView;
@FindBy(id = "dtlview_Last Name")
private WebElement LastNameView;
@FindBy(name = "Delete")
private WebElement deleteButton;
@FindBy(name = "hdrLink")
private WebElement HeaderContactsLink;
@FindBy(xpath = "(//a[@title='Contacts'])[2]/../..//child::input[@name='selected_id']")
private WebElement Checkbox;
@FindBy(name = "crmbutton small delete")
private WebElement DeleteButtonOnList;
public ContactsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getCreateContactsButton() {
	return createContactsButton;
}
public WebElement getFirstNameView() {
	return firstNameView;
}
public WebElement getLastNameView() {
	return LastNameView;
}
public WebElement getDeleteButton() {
	return deleteButton;
}
public WebElement getHeaderContactsLink() {
	return HeaderContactsLink;
}
public WebElement getCheckbox() {
	return Checkbox;
}
public WebElement getDeleteButtonOnList() {
	return DeleteButtonOnList;
}




}
