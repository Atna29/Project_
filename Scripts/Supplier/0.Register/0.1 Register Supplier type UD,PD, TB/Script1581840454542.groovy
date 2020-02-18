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

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Object Repository/Supplier/Login Page/Registration button'), 30)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Supplier/Login Page/Registration button'))

WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/email'), GlobalVariable.new_email_add_supplier)

WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/password'), 'asAS1234')

WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/password confirmation'), 'asAS1234')

WebUI.submit(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/Button SELANJUTNYA'))

'Nama usaha field'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Nama Usaha'), 'Test Supplier')

'No. HP field'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/No Handphone'), '1234567890')

'alamat field'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Alamat') , 'Jalan pegangsaan timur')

'Provindi field'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Provinsi'))

WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Option province'))

'kabupaten field'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/kota or kabupaten'))

WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Option City'))

'Kecamatan field'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/kecamatan'))

WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Option Kecamatan'))

'kelurahan field'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Kelurahan'))

WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Option Kelurahan'))

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Button SELANJUTNYA'), 5)

'kode pos'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Kode Pos'), '12345')

'bank field'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Bank'))

WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Option Bank'))

'no rekening field'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/no rekening'), '1234567890')

'nama rekening field'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/nama rekening'), 'Testing Supplier')

WebUI.submit(findTestObject('Object Repository/Supplier/Registration/Informasi Utama/Button SELANJUTNYA'))

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/jenis usaha - UD,PD,TB'), 5)

'Choose type of Supplier'
WebUI.click(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/jenis usaha - UD,PD,TB'))

'Input NPWP number'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/No NPWP'), '1234567890123456')

'Input KTP number'
WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/No KTP'), '1234567890123456')

'Upload image NPWP'
WebUI.uploadFile(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/Upload image NPWP'), GlobalVariable.upload_image_npwp_buyer)

'Upload image KTP'
WebUI.uploadFile(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/Upload image KTP'), GlobalVariable.upload_image_KTP_buyer)

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/Button DAFTAR'), 5)

'Submit TAMBAH'
WebUI.submit(findTestObject('Object Repository/Supplier/Registration/Informasi lengkap/Button DAFTAR'))

WebUI.delay(5)

WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()