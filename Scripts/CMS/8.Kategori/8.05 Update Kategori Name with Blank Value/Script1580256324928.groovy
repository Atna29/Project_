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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.admin_base_url)

WebUI.setText(findTestObject('Admin/Page_Admin_Login/input_Email_email'), GlobalVariable.admin_login_email)

WebUI.setText(findTestObject('Admin/Page_Admin_Login/input_Kata Sandi_password'), GlobalVariable.admin_login_pass)

WebUI.click(findTestObject('Object Repository/Admin/Page_Admin_Kategori/button_MASUK'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Admin_Kategori/span_Kategori'))

WebUI.click(findTestObject('Object Repository/Admin/Page_Admin_Kategori/i_Sayur_fas fa-ellipsis-v action'))

WebUI.waitForElementPresent(findTestObject('Admin/Page_Admin_Kategori/a_Ubah'), 3)

WebUI.click(findTestObject('Admin/Page_Admin_Kategori/a_Ubah'))

WebUI.waitForElementPresent(findTestObject('Admin/Page_Admin_Kategori/input_Nama Kategori_category_name'), 5)

WebUI.clearText(findTestObject('Admin/Page_Admin_Kategori/input_Nama Kategori_category_name'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Admin/Page_Admin_Kategori/input_Nama Kategori_category_name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Page_Admin_Kategori/button_UBAH'))

WebUI.click(findTestObject('Admin/Page_Admin_Kategori/span_Nama Kategori tidak boleh kosong'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Page_Admin_Kategori/button_UBAH'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Page_Admin_Login/div_Keluar'))
WebUI.closeBrowser()
