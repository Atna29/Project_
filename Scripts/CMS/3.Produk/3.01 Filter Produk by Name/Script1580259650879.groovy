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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dash.devmind3.net/')

WebUI.setText(findTestObject('Object Repository/Admin/Page_Admin_Produk/input_Email_email'), 'admin_cms2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Page_Admin_Produk/input_Kata Sandi_password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.sendKeys(findTestObject('Object Repository/Admin/Page_Admin_Produk/input_Kata Sandi_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Admin/Page_Admin_Produk/div_Produk'))

WebUI.setText(findTestObject('Object Repository/Admin/Page_Admin_Produk/input_PRODUK_form-control w-100'), 'Beras')

WebUI.click(findTestObject('Object Repository/Admin/Page_Admin_Produk/button_Cari'))

