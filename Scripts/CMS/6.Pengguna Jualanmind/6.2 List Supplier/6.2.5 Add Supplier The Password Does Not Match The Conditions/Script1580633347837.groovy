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

WebUI.openBrowser(GlobalVariable.admin_base_url)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Admin/Page_Admin_Login/button_MASUK'), 30)

WebUI.setText(findTestObject('Admin/Page_Admin_Login/input_Email_email'), GlobalVariable.admin_login_email)

WebUI.setText(findTestObject('Admin/Page_Admin_Login/input_Kata Sandi_password'), GlobalVariable.admin_login_pass)

WebUI.click(findTestObject('Admin/Page_Admin_Login/button_MASUK'))

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/Admin/Pengguna/menu pengguna'), 'id', 'pengguna', 0)

WebUI.click(findTestObject('Object Repository/Admin/Pengguna/menu pengguna'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Daftar buyer'), 0)

WebUI.click(findTestObject('Object Repository/Admin/Pengguna/Daftar Supplier/Menu daftar supplier'))

WebUI.click(findTestObject('Object Repository/Admin/Pengguna/Daftar Supplier/Tambah Supplier Button'))

WebUI.setText(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/email field'), 'cevebl@boxe.com')

WebUI.setText(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/password field'), '123')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field password - password not unique'), 'Password harus terdiri dari huruf besar, huruf kecil & angka! (ex: Secret123)')

WebUI.takeScreenshot()

WebUI.closeBrowser()
