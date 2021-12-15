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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), username)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), password)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_Women'))

WebUI.click(findTestObject('Object Repository/Page_Women - My Store/a_Dresses'))

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/a_T-shirts'))

WebUI.setText(findTestObject('Object Repository/Page_Dresses - My Store/input_Call us now_search_query'), 'dress')

WebUI.click(findTestObject('Object Repository/Page_Dresses - My Store/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Search - My Store/img_Showing 1 - 7 of 7 items_replace-2x img_043d87'))

WebUI.click(findTestObject('Object Repository/Page_Printed Summer Dress - My Store/span_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Printed Summer Dress - My Store/span_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/ProceedButton'))

WebUI.setText(findTestObject('Object Repository/Page_Order - My Store/textarea_If you would like to add a comment_a4f199'), 
    'testing')

WebUI.click(findTestObject('ProcessAddress'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/span_Proceed to checkout_1'))

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/a_Pay by bank wire (order processing will b_e7efad'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

WebUI.click(findTestObject('Object Repository/Page_Order confirmation - My Store/a_Back to orders'))

WebUI.click(findTestObject('Object Repository/Page_Order history - My Store/a_Sign out'))

WebUI.closeBrowser()

