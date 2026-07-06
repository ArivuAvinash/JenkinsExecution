package org.vtiger.contacts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.vtiger.businessutility.BaseClass;
import org.vtiger.objectrepository.ContactsPage;
import org.vtiger.objectrepository.CreateContactsPage;
import org.vtiger.objectrepository.Homepage;
@Listeners(org.vtiger.genericutility.ListenerUtility.class)
public class TC003_ToVerifyUserIsAbleToCreateMultipleContactWithMandatoryFieldsTest extends BaseClass{
@Test(dataProviderClass = org.vtiger.genericutility.DataProviderUtility.class,dataProvider = "Multicontact")
public void toCreateMultipleContactsWithMandatoryFields(String FIRSTNAME,String LASTNAME,String MOBILE) throws Throwable {
	
	Homepage homepage=new Homepage(driver);
	homepage.getContactsLink().click();
	ContactsPage contactPage= new ContactsPage(driver);
	contactPage.getCreateContactsButton().click();
	CreateContactsPage createContactPage= new CreateContactsPage(driver);
	createContactPage.getFirstNameTextFiled().sendKeys(FIRSTNAME);
	createContactPage.getLastNameTextFiled().sendKeys(LASTNAME);
	createContactPage.getMobileTextField().sendKeys(MOBILE+jUtil.randomNumber(100000));
	createContactPage.getBottonSaveButton().click();
	Thread.sleep(1000);
	Assert.assertEquals(contactPage.getFirstNameView().getText(),FIRSTNAME);
	Thread.sleep(1000);
	Assert.assertEquals(contactPage.getLastNameView().getText(),LASTNAME);
	Thread.sleep(1000);
	contactPage.getDeleteButton().click();
	Thread.sleep(1000);
	webUtil.toHandleJSPopup(driver).accept(); 
	Thread.sleep(1000);
}
}
