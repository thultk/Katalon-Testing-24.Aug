package Keywords.cms

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger
import internal.GlobalVariable
import java.util.Date;
import java.text.DateFormat
import java.text.SimpleDateFormat

public class kwRandomUserName {
	//Add keyword to create userName randomly
	@Keyword
	public static String generateUser(){
		KeywordLogger log = new KeywordLogger()
		def date = new Date()
		def temp = new SimpleDateFormat("ddMMyyyyHHmmss")
		try{
			return "user_" + temp.format(date);
			log.logInfo("Generated a new User successfully")
		}
		catch (Exception e){
			//Add log for more info if error occurs when generate user
			log.logInfo("Unable to generate new User. Please double check...")
		}
	}
}
