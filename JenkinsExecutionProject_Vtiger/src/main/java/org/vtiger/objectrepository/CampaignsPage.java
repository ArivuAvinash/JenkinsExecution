package org.vtiger.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignsPage {
	@FindBy (xpath = "//img[@title='Create Campaign...']")
	private WebElement createCampaignButton;
	@FindBy (id = "dtlview_Campaign Name")
	private WebElement campaignNameView;
	@FindBy(linkText = "More Information")
	private WebElement moreInformationLink;
	@FindBy(xpath = "(//input[@title='Edit [Alt+E]'])[1]")
	private WebElement editButton;
	@FindBy(xpath = "(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicateButton;
	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deleteButton;
	@FindBy (name = "privrecord")
	private WebElement previousButton;
	@FindBy (id = "jumpBtnIdTop")
	private WebElement jumpToIdButton;
	@FindBy (linkText = "Add Event")
	private WebElement addEventLink;
	@FindBy (linkText = " Administrator")
	private WebElement administatorLink;
	@FindBy(linkText = "Campaign Information")
	private  WebElement campaignInformationLink;
	@FindBy (xpath = "//img[@id=\"show_Campaigns_Contacts\"]")
	private WebElement contactButton;
	@FindBy(xpath = "//input[@title='Send Mail']")
	private WebElement sendMailButton;
	@FindBy(xpath = "//input[@title='Load List']")
	private WebElement loadListButton;
	@FindBy(xpath = "//input[@title='Select Contacts']")
	private WebElement selectContactsButton;
	@FindBy(xpath = "//input[@title='Add Contact']")
	private WebElement addContactButton;
	@FindBy(id = "Contacts_cv_list")
	private WebElement contactCvListDropdown;
	
	
	public CampaignsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateCampaignButton() {
		return createCampaignButton;
	}

	public WebElement getCampaignNameView() {
		return campaignNameView;
	}

	public WebElement getMoreInformationLink() {
		return moreInformationLink;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getDuplicateButton() {
		return duplicateButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getJumpToIdButton() {
		return jumpToIdButton;
	}

	public WebElement getAddEventLink() {
		return addEventLink;
	}

	public WebElement getAdministatorLink() {
		return administatorLink;
	}

	public WebElement getCampaignInformationLink() {
		return campaignInformationLink;
	}

	public WebElement getContactButton() {
		return contactButton;
	}
	
	
}
