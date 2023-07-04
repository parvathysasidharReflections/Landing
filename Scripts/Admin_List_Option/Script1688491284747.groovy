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

WebUI.navigateToUrl('https://nebyu-app-admin-us-qa.azurewebsites.net/')

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/Page_Cap Builder Admin/Page_Cap Builder Admin/a_Sign in'), 
    'Sign in')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/Page_Cap Builder Admin/Page_Cap Builder Admin/img_Cap Builder Admin_mx-auto h-10 w-auto'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/Page_Cap Builder Admin/Page_Cap Builder Admin/h2_Cap Builder Admin'), 
    'Cap Builder Admin')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/Page_Cap Builder Admin/Page_Cap Builder Admin/p_Not a member Sign Up'), 
    0)

WebUI.closeBrowser()

