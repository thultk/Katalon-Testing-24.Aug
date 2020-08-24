import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import internal.GlobalVariable

public class LoginOrangeHRMDef {
	@Given ("User navigates to OrangeHRM Page")
	def navigateToOrangeHRM() {
		println ("\n User is inside LoginOrangeHRMDef")
		//WebUI.openBrowser()
		WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/")
	}

	@When("User enters (.*) and (.*)")
	def enterUsernamePassword(String username, String password) {
		println ("\n User is inside usernamepassword")
		WebUI.setText(findTestObject('Object Repository/Repository 2/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setText(findTestObject('Object Repository/Repository 2/Page_OrangeHRM/input_Username_txtPassword'), password)
	}
	@And("User clicks on Login button")
	def clickLogin() {
		println ("\n User is inside clickLogin")
		WebUI.click(findTestObject('Object Repository/Repository 2/Page_OrangeHRM/input_Password_Submit'))
	}
	@Then("User is navigated to Welcome Page")
	def navigateToWelcome() {
		println ("\n User is inside navigateToWelcome")
	}
}
