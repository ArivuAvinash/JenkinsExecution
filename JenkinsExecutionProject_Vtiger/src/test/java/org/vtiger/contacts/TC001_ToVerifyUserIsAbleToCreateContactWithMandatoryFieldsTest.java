package org.vtiger.contacts;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.vtiger.businessutility.BaseClass;
import org.vtiger.objectrepository.ContactsPage;
import org.vtiger.objectrepository.CreateContactsPage;
import org.vtiger.objectrepository.Homepage;
@Listeners(org.vtiger.genericutility.ListenerUtility.class)
public class TC001_ToVerifyUserIsAbleToCreateContactWithMandatoryFieldsTest extends BaseClass{
@Test(retryAnalyzer = org.vtiger.genericutility.RetryAnalyzer.class)
public void toCreateContactsWithMandatoryFields() throws EncryptedDocumentException, IOException, InterruptedException {
	String FIRSTNAME= futil.readDataFromExcelFile("ContactPage", 1, 0)+jUtil.randomData();
	String LASTNAME= futil.readDataFromExcelFile("ContactPage", 1, 1)+jUtil.randomData();
	String MOBILE=futil.readDataFromExcelFile("ContactPage", 1, 8)+jUtil.randomNumber(100000);
	Homepage homepage=new Homepage(driver);
	homepage.getContactsLink().click();
	ContactsPage contactPage= new ContactsPage(driver);
	contactPage.getCreateContactsButton().click();
	CreateContactsPage createContactPage= new CreateContactsPage(driver);
	createContactPage.getFirstNameTextFiled().sendKeys(FIRSTNAME);
	createContactPage.getLastNameTextFiled().sendKeys(LASTNAME);
	createContactPage.getMobileTextField().sendKeys(MOBILE);createContactPage.getBottonSaveButton().click();
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
