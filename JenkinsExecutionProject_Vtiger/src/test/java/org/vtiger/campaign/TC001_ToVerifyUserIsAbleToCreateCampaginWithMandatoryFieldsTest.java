package org.vtiger.campaign;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.vtiger.businessutility.BaseClass;
import org.vtiger.objectrepository.CampaignsPage;
import org.vtiger.objectrepository.CreateCampaignPage;
import org.vtiger.objectrepository.Homepage;

@Listeners(org.vtiger.genericutility.ListenerUtility.class)
public class TC001_ToVerifyUserIsAbleToCreateCampaginWithMandatoryFieldsTest extends BaseClass {
@Test(retryAnalyzer = org.vtiger.genericutility.RetryAnalyzer.class)
public void createCampaignWithMandatoryFileds() throws EncryptedDocumentException, IOException, InterruptedException {
	String CAMPAIGNNAME= futil.readDataFromExcelFile("CampaignPage", 1, 0)+jUtil.randomData();
	String EXPECTEDCLOSINGDATE= futil.readDataFromExcelFile("CampaignPage", 1, 1);
	homePage = new Homepage(driver);
	webUtil.toMoveToElement(driver, homePage.getMoreOptionsLink());
	homePage.getCampaignsLink().click();
	campaignPage = new CampaignsPage(driver);
	campaignPage.getCreateCampaignButton().click();
	createCampaignPage= new CreateCampaignPage(driver);
	createCampaignPage.getCampaignNameTextField().sendKeys(CAMPAIGNNAME);
	createCampaignPage.getClosingdateTextField().clear();
	createCampaignPage.getClosingdateTextField().sendKeys(EXPECTEDCLOSINGDATE);
	createCampaignPage.getSaveButton().click();
	Assert.assertEquals(campaignPage.getCampaignNameView().getText(), CAMPAIGNNAME);
	campaignPage.getDeleteButton().click();
	Thread.sleep(1000);
	webUtil.toHandleJSPopup(driver).accept();  
	Thread.sleep(1000);
}
}
