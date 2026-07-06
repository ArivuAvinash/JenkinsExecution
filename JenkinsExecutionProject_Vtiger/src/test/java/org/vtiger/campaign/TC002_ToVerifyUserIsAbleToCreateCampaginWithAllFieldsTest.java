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
public class TC002_ToVerifyUserIsAbleToCreateCampaginWithAllFieldsTest extends BaseClass {
@Test(retryAnalyzer = org.vtiger.genericutility.RetryAnalyzer.class)
public void createCampaignWithAllFileds() throws EncryptedDocumentException, IOException, InterruptedException {
	String CAMPAIGNNAME= futil.readDataFromExcelFile("CampaignPage", 1, 0)+jUtil.randomData();
	String EXPECTEDCLOSINGDATE= futil.readDataFromExcelFile("CampaignPage", 1, 1);
	String TARGETAUDIENCE = futil.readDataFromExcelFile("CampaignPage", 1, 2);
	String SPONSER = futil.readDataFromExcelFile("CampaignPage", 1, 3);
	String NUMSENT = futil.readDataFromExcelFile("CampaignPage", 1, 4);
	String TARGETSIZE = futil.readDataFromExcelFile("CampaignPage", 1, 5);
	String BUDGETCOST = futil.readDataFromExcelFile("CampaignPage", 1, 6);
	String ACTUALCOST = futil.readDataFromExcelFile("CampaignPage", 1, 7);
	String EXPECTEDREVENUE = futil.readDataFromExcelFile("CampaignPage", 1, 8);
	String EXPECTEDSALESCOUNT = futil.readDataFromExcelFile("CampaignPage", 1, 9);
	String ACTUALSALESCOUNT = futil.readDataFromExcelFile("CampaignPage", 1, 10);
	String EXPECTEDRESPONSECOUNT=futil.readDataFromExcelFile("CampaignPage", 1, 11);
	String ACTUALRESPONSECOUNT=futil.readDataFromExcelFile("CampaignPage", 1, 12);
	String EXPECTEDROI=futil.readDataFromExcelFile("CampaignPage", 1, 13);
	String ACTUALROI=futil.readDataFromExcelFile("CampaignPage", 1, 14);
	String DESCRIPTION=futil.readDataFromExcelFile("CampaignPage", 1, 15);
	homePage = new Homepage(driver);
	webUtil.toMoveToElement(driver, homePage.getMoreOptionsLink());
	homePage.getCampaignsLink().click();
	campaignPage = new CampaignsPage(driver);
	campaignPage.getCreateCampaignButton().click();
	createCampaignPage= new CreateCampaignPage(driver);
	createCampaignPage.getCampaignNameTextField().sendKeys(CAMPAIGNNAME);
	webUtil.toSelectByIndex(createCampaignPage.getCampaignTypeDropdown() , 3);
	createCampaignPage.getTargetAudienceTextField().sendKeys(TARGETAUDIENCE);
	createCampaignPage.getSponsorTextField().sendKeys(SPONSER);
	createCampaignPage.getNumsentTextField().sendKeys(NUMSENT);
	webUtil.toSelectByValue(createCampaignPage.getCampaignstatusDropdown(),"Planning");
	createCampaignPage.getClosingdateTextField().clear();
	createCampaignPage.getClosingdateTextField().sendKeys(EXPECTEDCLOSINGDATE);
	createCampaignPage.getTargetsizeTextField().sendKeys(TARGETSIZE);
	createCampaignPage.getBudgetcostTextField().clear();
	createCampaignPage.getBudgetcostTextField().sendKeys(BUDGETCOST);
	webUtil.toSelectByValue(createCampaignPage.getExpectedresponseDropdown(), "Good");
	createCampaignPage.getExpectedsalescountTextField().sendKeys(EXPECTEDSALESCOUNT);
	createCampaignPage.getExpectedresponsecountTextField().sendKeys(EXPECTEDRESPONSECOUNT);
	createCampaignPage.getExpectedroiTextField().clear();
	createCampaignPage.getExpectedroiTextField().sendKeys(EXPECTEDROI);
	createCampaignPage.getActualcostTextField().clear();
	createCampaignPage.getActualcostTextField().sendKeys(ACTUALCOST);
	createCampaignPage.getExpectedrevenueTextField().clear();
	createCampaignPage.getExpectedrevenueTextField().sendKeys(EXPECTEDREVENUE);
	createCampaignPage.getActualsalescountTextField().sendKeys(ACTUALSALESCOUNT);
	createCampaignPage.getActualresponsecountTextField().sendKeys(ACTUALRESPONSECOUNT);
	createCampaignPage.getActualroiTextField().clear();
	createCampaignPage.getActualroiTextField().sendKeys(ACTUALROI);
	createCampaignPage.getDescriptionTextField().sendKeys(DESCRIPTION);
	Thread.sleep(3000);
	createCampaignPage.getSaveButton().click();
	Assert.assertEquals(campaignPage.getCampaignNameView().getText(), CAMPAIGNNAME);
	campaignPage.getDeleteButton().click();
	Thread.sleep(1000);
	webUtil.toHandleJSPopup(driver).accept();  
	Thread.sleep(1000);
}
}
