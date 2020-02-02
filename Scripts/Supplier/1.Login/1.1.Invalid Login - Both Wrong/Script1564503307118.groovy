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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.base_url + GlobalVariable.sup_login_url)

//WebUI.navigateToUrl("https://supplier.devmind3.net/login")

WebUI.delay(GlobalVariable.delay_3)

WebUI.setText(findTestObject('null'), GlobalVariable.invalid_password)

WebUI.setEncryptedText(findTestObject('null'), GlobalVariable.invalid_password)

WebUI.delay(GlobalVariable.delay_3)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(GlobalVariable.delay_3)

WebUI.click(findTestObject('null'))

WebUI.delay(GlobalVariable.delay_3)

WebUI.closeBrowser()

