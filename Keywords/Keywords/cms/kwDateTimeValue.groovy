package Keywords.cms

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.DateFormat
import java.text.SimpleDateFormat
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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import java.util.Date;
import com.kms.katalon.core.logging.KeywordLogger

import internal.GlobalVariable


public class kwDateTimeValue {
	//Add keyword to parse date time format to string format
	@Keyword
	public static String returnDateTimeValue(){
		KeywordLogger log = new KeywordLogger()
		Date date = new Date()
		DateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy HH:mm:ss')
		String date1 = dateFormat.format(date)
		try{
			return '['+date1+']'
		}
		catch(Exception e){
			//Add log for more info if error occurs when parse date time to string
			log.logInfo("Unable to parse date time to string. Please double check...")
		}
	}
}