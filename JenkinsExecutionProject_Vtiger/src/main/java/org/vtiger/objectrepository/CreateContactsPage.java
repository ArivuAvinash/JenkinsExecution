package org.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactsPage {
@FindBy(name = "salutationtype")
private WebElement salutationTypeDropdown;
@FindBy(name = "firstname")
private WebElement firstNameTextFiled;
@FindBy(name = "lastname")
private WebElement lastNameTextFiled;
@FindBy(xpath = "(//img[@title=\"Select\"])[1]")
private WebElement addOrganizationButton;
@FindBy(xpath = "(//input[@title=\"Clear\"])[1]")
private WebElement clearOraganizationButton;
@FindBy(name = "leadsource")
private WebElement leadsourceDropdown;
@FindBy(id = "title")
private WebElement titleTextField;
@FindBy(id = "department")
private WebElement departmentTextField;
@FindBy(id = "email")
private WebElement emailTextField;
@FindBy(id = "assistant")
private WebElement assistantTextField;
@FindBy(name = "emailoptout")
private WebElement emailoptoutCheckBox;
@FindBy(name = "reference")
private WebElement referenceCheckBox;
@FindBy(name = "notify_owner")
private WebElement notifyOwnerCheckBox;
@FindBy(id = "phone")
private WebElement officePhoneTextField;
@FindBy(id = "mobile")
private WebElement mobileTextField;
@FindBy(id = "homephone")
private WebElement homePhoneTextField;
@FindBy(id = "otherphone")
private WebElement otherPhoneTextField;
@FindBy(id = "fax")
private WebElement faxTextField;
@FindBy (name = "birthday")
private WebElement birthdateTextField;
@FindBy(xpath = "(//img[@title=\"Select\"])[1]")
private WebElement addReportToButton;
@FindBy(xpath = "(//input[@title=\"Clear\"])[1]")
private WebElement clearReportToButton;
@FindBy(id = "secondaryemail")
private WebElement secondaryEmailTextField;
@FindBy(name = "donotcall")
private WebElement donotCallCheckBox;
@FindBy(name = "portal")
private WebElement portalCheckBox;
@FindBy(name = "support_end_date")
private WebElement supportEndDateTextField;
@FindBy(name = "support_start_date")
private WebElement supportStartDateTextField;
@FindBy(xpath = "//b[text()='Copy Other Address']/preceding-sibling::input")
private WebElement copyOtherAddressRadioButton;
@FindBy(xpath = "//b[text()='Copy Mailing Address']/preceding-sibling::input")
private WebElement copyMailingAddressRadioButton;
@FindBy(name = "mailingstreet")
private WebElement mailingStreetTextField;
@FindBy(id = "mailingpobox")
private WebElement mailingPOBoxTextField;
@FindBy(id = "mailingcity")
private WebElement mailingCityTextField;
@FindBy(id = "mailingstate")
private WebElement mailingStateTextField;
@FindBy(id = "mailingzip")
private WebElement mailingPostalCodeTextField;
@FindBy(id = "mailingcountry")
private WebElement mailingCountryTextField;
@FindBy(name = "otherstreet")
private WebElement otherStreetTextField;
@FindBy(id = "otherpobox")
private WebElement otherPOBoxTextField;
@FindBy(id = "othercity")
private WebElement otherCityTextField;
@FindBy(id = "otherstate")
private WebElement otherStateTextField;
@FindBy(id = "otherzip")
private WebElement otherPostalCodeTextField;
@FindBy(id = "othercountry")
private WebElement otherCountryTextField;
@FindBy(name = "description")
private WebElement descriptionTextField;
@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
private WebElement topSaveButton;
@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[2]")
private WebElement bottonSaveButton;
@FindBy( xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
private WebElement topCancelButton;
@FindBy( xpath = "(//input[@title='Cancel [Alt+X]'])[2]")
private WebElement bottomCancelButton;
@FindBy(id="assistantphone")
private WebElement assistancePhoneTextField;
public CreateContactsPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getSalutationTypeDropdown() {
	return salutationTypeDropdown;
}
public WebElement getFirstNameTextFiled() {
	return firstNameTextFiled;
}
public WebElement getLastNameTextFiled() {
	return lastNameTextFiled;
}
public WebElement getAddOrganizationButton() {
	return addOrganizationButton;
}
public WebElement getClearOraganizationButton() {
	return clearOraganizationButton;
}
public WebElement getLeadsourceDropdown() {
	return leadsourceDropdown;
}
public WebElement getTitleTextField() {
	return titleTextField;
}
public WebElement getDepartmentTextField() {
	return departmentTextField;
}
public WebElement getEmailTextField() {
	return emailTextField;
}
public WebElement getAssistantTextField() {
	return assistantTextField;
}
public WebElement getEmailoptoutCheckBox() {
	return emailoptoutCheckBox;
}
public WebElement getReferenceCheckBox() {
	return referenceCheckBox;
}
public WebElement getNotifyOwnerCheckBox() {
	return notifyOwnerCheckBox;
}
public WebElement getOfficePhoneTextField() {
	return officePhoneTextField;
}
public WebElement getMobileTextField() {
	return mobileTextField;
}
public WebElement getHomePhoneTextField() {
	return homePhoneTextField;
}
public WebElement getOtherPhoneTextField() {
	return otherPhoneTextField;
}
public WebElement getFaxTextField() {
	return faxTextField;
}
public WebElement getBirthdateTextField() {
	return birthdateTextField;
}
public WebElement getAddReportToButton() {
	return addReportToButton;
}
public WebElement getClearReportToButton() {
	return clearReportToButton;
}
public WebElement getSecondaryEmailTextField() {
	return secondaryEmailTextField;
}
public WebElement getDonotCallCheckBox() {
	return donotCallCheckBox;
}
public WebElement getPortalCheckBox() {
	return portalCheckBox;
}
public WebElement getSupportEndDateTextField() {
	return supportEndDateTextField;
}
public WebElement getSupportStartDateTextField() {
	return supportStartDateTextField;
}
public WebElement getCopyOtherAddressRadioButton() {
	return copyOtherAddressRadioButton;
}
public WebElement getCopyMailingAddressRadioButton() {
	return copyMailingAddressRadioButton;
}
public WebElement getMailingStreetTextField() {
	return mailingStreetTextField;
}
public WebElement getMailingPOBoxTextField() {
	return mailingPOBoxTextField;
}
public WebElement getMailingCityTextField() {
	return mailingCityTextField;
}
public WebElement getMailingStateTextField() {
	return mailingStateTextField;
}
public WebElement getMailingPostalCodeTextField() {
	return mailingPostalCodeTextField;
}
public WebElement getMailingCountryTextField() {
	return mailingCountryTextField;
}
public WebElement getOtherStreetTextField() {
	return otherStreetTextField;
}
public WebElement getOtherPOBoxTextField() {
	return otherPOBoxTextField;
}
public WebElement getOtherCityTextField() {
	return otherCityTextField;
}
public WebElement getOtherStateTextField() {
	return otherStateTextField;
}
public WebElement getOtherPostalCodeTextField() {
	return otherPostalCodeTextField;
}
public WebElement getOtherCountryTextField() {
	return otherCountryTextField;
}
public WebElement getDescriptionTextField() {
	return descriptionTextField;
}
public WebElement getTopSaveButton() {
	return topSaveButton;
}
public WebElement getBottonSaveButton() {
	return bottonSaveButton;
}
public WebElement getTopCancelButton() {
	return topCancelButton;
}
public WebElement getBottomCancelButton() {
	return bottomCancelButton;
}
public WebElement getAssistancePhoneTextField() {
	return assistancePhoneTextField;
}

}


