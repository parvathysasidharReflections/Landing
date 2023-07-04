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

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Sign in'), 0)

WebUI.click(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Sign in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/img_Configuration_h-a w-14'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/h1_Dashboard'), 'Dashboard')

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Home'), 'Home')

WebUI.waitForElementPresent(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Configuration'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Configuration'), 'Configuration')

WebUI.click(findTestObject('Object Repository/Pages/Page_Cap Builder Admin/a_Configuration'))

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Configurations/th_Name'), 'Name')

WebUI.click(findTestObject('Object Repository/Pages/Page_Configurations/th_Display Name'))

WebUI.verifyElementText(findTestObject('Object Repository/Pages/Page_Configurations/th_Display Name'), 'Display Name')

