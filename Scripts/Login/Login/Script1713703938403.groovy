import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.eklipse.gg/login')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Eklipse/img_Logo'), 0)

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Eklipse/text_Welcome back'), 0)

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Eklipse/txtField_username'), 0)

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Eklipse/txtField_password'), 0)

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Eklipse/button_Sign In'), 0)

WebUI.setText(findTestObject('Login Page/Page_Eklipse/txtField_username'), 'aldoeklipse@gmail.com')

WebUI.setText(findTestObject('Login Page/Page_Eklipse/txtField_password'), '12345678')

WebUI.click(findTestObject('Login Page/Page_Eklipse/button_Sign In'))

WebUI.waitForElementPresent(findTestObject('Register Page/Page_Eklipse/button_Get my Stream Clips'), 30)

WebUI.verifyElementPresent(findTestObject('Register Page/Page_Eklipse/button_Get my Stream Clips'), 0)

WebUI.closeBrowser()

