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

WebUI.click(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer Button'))

WebUI.setText(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/email field'), GlobalVariable.email_negative_case)

WebUI.setText(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/password field'), 'asAS1234')

WebUI.setText(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/confirm password field'), 'asAS1234')

WebUI.click(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi dasar/button selanjutnya'))

'Provindi field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Provinsi'), '31', false)

'kabupaten field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kabupaten'), '3174', false)

'Kecamatan field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kecamatan'), '3174020', false)

'kelurahan field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kelurahan'), '3174020004', false)

WebUI.scrollToElement(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Informasi Utama - Button SELANJUTNYA'), 5)

'bank field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/bank'), '65', false)

WebUI.submit(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Informasi Utama - Button SELANJUTNYA'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field nama rekening - Nama Pemilik Rekening tidak boleh kosong'), 'Nama Pemilik Rekening tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field no rekening - No. Rekening tidak boleh kosong'), 'No. Rekening tidak boleh kosong')

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Nama usaha'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field nama usaha - Nama Usaha tidak boleh kosong'), 'Nama Usaha tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field no hp - No handphone tidak boleh kosong'), 'No handphone tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field alamat - Alamat tidak boleh kosong'), 'Alamat tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field kodek pos - Kode Pos tidak boleh kosong'), 'Kode Pos tidak boleh kosong')

WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()
