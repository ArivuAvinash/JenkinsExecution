package org.vtiger.objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
@FindBy (name = "campaignname")
private WebElement campaignNameTextField;
@FindBy(name = "closingdate")
private WebElement closingdateTextField;
@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
private WebElement saveButton;
@FindBy (name = "campaigntype")
private WebElement campaignTypeDropdown;
@FindBy(id = "targetaudience")
private WebElement targetAudienceTextField;
@FindBy(id = "sponsor")
private WebElement sponsorTextField;
@FindBy(id = "numsent")
private WebElement numsentTextField;
@FindBy (name = "campaignstatus")
private WebElement campaignstatusDropdown;
@FindBy(xpath = "//img[@title='Select']")
private WebElement addProductBtton;
@FindBy(xpath = "//input[@title='Clear']")
private WebElement clearProductButton;
@FindBy(xpath = "//img[@id='jscal_trigger_closingdate']")
private WebElement closingDateCalenderButton;
@FindBy(id = "targetsize")
private WebElement targetsizeTextField;
@FindBy(name = "budgetcost")
private WebElement budgetcostTextField;
@FindBy(name = "expectedresponse")
private WebElement expectedresponseDropdown;
@FindBy(id = "expectedsalescount")
private WebElement expectedsalescountTextField;
@FindBy(id = "expectedresponsecount")
private WebElement expectedresponsecountTextField;
@FindBy(name = "expectedroi")
private WebElement expectedroiTextField;
@FindBy(name = "actualcost")
private WebElement actualcostTextField;
@FindBy(name = "expectedrevenue")
private WebElement expectedrevenueTextField;
@FindBy(id = "actualsalescount")
private WebElement actualsalescountTextField;
@FindBy(id = "actualresponsecount")
private WebElement actualresponsecountTextField;
@FindBy(name = "actualroi")
private WebElement actualroiTextField;
@FindBy(name = "description")
private WebElement descriptionTextField;
@FindBy( xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
private WebElement cancelButton;
public CreateCampaignPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getCampaignNameTextField() {
	return campaignNameTextField;
}
public WebElement getClosingdateTextField() {
	return closingdateTextField;
}
public WebElement getSaveButton() {
	return saveButton;
}
public WebElement getCampaignTypeDropdown() {
	return campaignTypeDropdown;
}
public WebElement getTargetAudienceTextField() {
	return targetAudienceTextField;
}
public WebElement getSponsorTextField() {
	return sponsorTextField;
}
public WebElement getNumsentTextField() {
	return numsentTextField;
}
public WebElement getCampaignstatusDropdown() {
	return campaignstatusDropdown;
}
public WebElement getAddProductBtton() {
	return addProductBtton;
}
public WebElement getClearProductButton() {
	return clearProductButton;
}
public WebElement getClosingDateCalenderButton() {
	return closingDateCalenderButton;
}
public WebElement getTargetsizeTextField() {
	return targetsizeTextField;
}
public WebElement getBudgetcostTextField() {
	return budgetcostTextField;
}
public WebElement getExpectedresponseDropdown() {
	return expectedresponseDropdown;
}
public WebElement getExpectedsalescountTextField() {
	return expectedsalescountTextField;
}
public WebElement getExpectedresponsecountTextField() {
	return expectedresponsecountTextField;
}
public WebElement getExpectedroiTextField() {
	return expectedroiTextField;
}
public WebElement getActualcostTextField() {
	return actualcostTextField;
}
public WebElement getExpectedrevenueTextField() {
	return expectedrevenueTextField;
}
public WebElement getActualsalescountTextField() {
	return actualsalescountTextField;
}
public WebElement getActualresponsecountTextField() {
	return actualresponsecountTextField;
}
public WebElement getActualroiTextField() {
	return actualroiTextField;
}
public WebElement getDescriptionTextField() {
	return descriptionTextField;
}
public WebElement getCancelButton() {
	return cancelButton;
}

}
