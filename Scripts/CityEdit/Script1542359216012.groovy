import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LoginSuccess'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Avantrade Infinity UI/div_Administration'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/div_City'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/div_Search'))

WebUI.setText(findTestObject('Page_Avantrade Infinity UI/input_searchcityname'), 'qwerty')

WebUI.click(findTestObject('Page_Avantrade Infinity UI/button_Search'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/a_Edit'))

WebUI.setText(findTestObject('Page_Avantrade Infinity UI/input__cityname'), 'qwerty-123')

WebUI.click(findTestObject('Page_Avantrade Infinity UI/button_Submit'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/button_Confirm'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/button_Close'))

WebUI.click(findTestObject('Page_Avantrade Infinity UI/div_Logout'))

