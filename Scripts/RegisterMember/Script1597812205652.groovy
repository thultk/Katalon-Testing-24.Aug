import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.xpath.internal.compiler.Keywords as Keywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def username = CustomKeywords.'Keywords.cms.kwRandomUserName.generateUser'()
def email = username + "@gmail.com"
def fullname = username + "FullName"
def password = 'aeHFOx8jV/A='
def confirmPassword = password


//Step 1: Navigate to CMS Home page: Already call in test listeners

//Step 2: Click on SignUp link
WebUI.click(findTestObject('Object Repository/HomePage/lnkSignUp'), FailureHandling.STOP_ON_FAILURE)

//Step 3: Input username
WebUI.setText(findTestObject('Object Repository/RegistrationPage/txtuserName'), username)

//Step 4: Input email
WebUI.setText(findTestObject('Object Repository/RegistrationPage/txtEmail'), email)

//Step 5: Input full name
WebUI.setText(findTestObject('Object Repository/RegistrationPage/txtfullName'), fullname)

//Step 6: Select gender
WebUI.selectOptionByIndex(findTestObject('Object Repository/RegistrationPage/drpGender'), 1)

//Step 7: Input value to password
WebUI.setText(findTestObject('Object Repository/RegistrationPage/txtpassWord'), 'aeHFOx8jV/A=')

//Step 8: Input confirm password
WebUI.setText(findTestObject('Object Repository/RegistrationPage/txtconfirmPassword'), password)

//Step 9: Click on Registration button
WebUI.click(findTestObject('Object Repository/RegistrationPage/btnRegistration'))

//Step 10: Verify message
//WebUI.verifyMatch(findTestObject('Object Repository/RegistrationPage/lblRegistationSuccessful'), 'Member registered! Thank you', true)

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/RegistrationPage/lblRegistationSuccessful')), 'Member registered! Thank you!', false, FailureHandling.STOP_ON_FAILURE)

