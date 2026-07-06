package org.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy (linkText ="Leads" )
private WebElement leadsLink;
@FindBy(linkText = "Contacts")
private WebElement contactsLink;
@FindBy( linkText = "Opportunities")
private WebElement opportunitiesLink;
@FindBy( linkText = "Products")
private WebElement productsLink;
@FindBy( linkText = "Documents")
private WebElement documentsLink;
@FindBy( linkText = "Email")
private WebElement emailLink;
@FindBy( linkText = "Trouble Tickets")
private WebElement troubleTicketsLink;
@FindBy( linkText = "Dashboard")
private WebElement dashboardLink;
@FindBy (xpath = "//td[@onmouseout=\"fnHide_Event('allMenu');\"]")
private WebElement moreOptionsLink;
@FindBy (xpath = "//a[@name='Campaigns']")
private WebElement campaignsLink;
@FindBy (xpath = "//a[@name='Invoice']")
private WebElement invoiceLink;
@FindBy (xpath = "//a[@name='Sales Order']")
private WebElement saleOrderLink;
@FindBy (xpath = "//a[@name='Quotes']")
private WebElement quotesLink;
@FindBy (xpath = "//td[@onmouseout=\"fnHideDrop('ondemand_sub');\"]")
private WebElement administatorIcon;
@FindBy( xpath = "//a[text()='Sign Out']")
private WebElement sigOutLink;
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getLeadsLink() {
	return leadsLink;
}
public WebElement getContactsLink() {
	return contactsLink;
}
public WebElement getOpportunitiesLink() {
	return opportunitiesLink;
}
public WebElement getProductsLink() {
	return productsLink;
}
public WebElement getDocumentsLink() {
	return documentsLink;
}
public WebElement getEmailLink() {
	return emailLink;
}
public WebElement getTroubleTicketsLink() {
	return troubleTicketsLink;
}
public WebElement getDashboardLink() {
	return dashboardLink;
}
public WebElement getMoreOptionsLink() {
	return moreOptionsLink;
}

public WebElement getCampaignsLink() {
	return campaignsLink;
}
public WebElement getInvoiceLink() {
	return invoiceLink;
}
public WebElement getSaleOrderLink() {
	return saleOrderLink;
}
public WebElement getQuotesLink() {
	return quotesLink;
}
public WebElement getAdministatorIcon() {
	return administatorIcon;
}
public WebElement getSigOutLink() {
	return sigOutLink;
}

}
