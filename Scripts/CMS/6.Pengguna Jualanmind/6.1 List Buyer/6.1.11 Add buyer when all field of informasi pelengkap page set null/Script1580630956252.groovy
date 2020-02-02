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

'Nama usaha field'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Nama usaha'), 'Test buyer')

'No. HP field'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/no, Handphone'), '1234567890')

'alamat field'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Alamat'), 'Jalan pegangsaan timur')

'Provindi field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Provinsi'), '31', false)

'kabupaten field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kabupaten'), '3174', false)

'Kecamatan field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kecamatan'), '3174020', false)

'kelurahan field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Kelurahan'), '3174020004', false)

'kode pos'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/kode pos'), '12345')

WebUI.scrollToElement(findTestObject('Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Informasi Utama - Button SELANJUTNYA'), 5)

'bank field'
WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/bank'), '65', false)

'no rekening field'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/No rekening'), '1234567890')

'nama rekening field'
WebUI.setText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/nama rekening'), 'Testing buyer')

WebUI.submit(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi Utama/Informasi Utama - Button SELANJUTNYA'))

WebUI.scrollToElement(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi lengkap/Button TAMBAH'), 5)

'Submit TAMBAH'
WebUI.submit(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi lengkap/Button TAMBAH'))

WebUI.scrollToElement(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Tambah Buyer/Informasi lengkap/No NPWP'), 5)

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field no npwp - No. NPWP tidak boleh kosong'), 'No. NPWP tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field no ktp - No. KTP tidak boleh kosong'), 'No. KTP tidak boleh kosong')

WebUI.verifyElementText(findTestObject('Object Repository/Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field upload npwp - Ukuran gambar harus dibawah 5MB'), 'Ukuran gambar harus dibawah 5MB')

WebUI.verifyElementText(findTestObject('Admin/Pengguna/Daftar Buyer/Validasi/Tambah Buyer/response field upload ktp - Ukuran gambar harus dibawah 5MB'), 'Ukuran gambar harus dibawah 5MB')

WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()
