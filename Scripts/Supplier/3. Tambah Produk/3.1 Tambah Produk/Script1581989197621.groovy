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

WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/email'), GlobalVariable.sup_email_valid)

WebUI.setText(findTestObject('Object Repository/Supplier/Registration/Informasi Dasar/password'), GlobalVariable.sup_pass_valid)

WebUI.click(findTestObject('Object Repository/Supplier/Login Page/Button Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Supplier/Beranda/Menu/Tambah Product'))

WebUI.uploadFile(findTestObject('Object Repository/Supplier/Tambah Produk/Upload Gambar'), GlobalVariable.upload_image_produk)

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Nama Produk'), 'Kentang Lokal')

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/category'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/Category - Sayur'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/Subcategory'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/SubCategory - Sayur Lokal'))

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Tambah Produk/panjang'), 5)

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/harga'), '150')

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/Satuan'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/satuan - gram'))

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Stock'), '500')

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Deskripsi'), 'Kentang Lokal Kualitas terbaik')

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/panjang'), '15')

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Lebar'), '10')

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Tinggi'), '10')

WebUI.setText(findTestObject('Object Repository/Supplier/Tambah Produk/Berat (gram)') ,'50')

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Tambah Produk/Button Tambah'), 5)

WebUI.check(findTestObject('Object Repository/Supplier/Tambah Produk/Check Self delivery'))

WebUI.check(findTestObject('Object Repository/Supplier/Tambah Produk/Check Virtual Account'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/Button Tambah'))

WebUI.click(findTestObject('Object Repository/Supplier/Tambah Produk/Button Tambah Confirmation'))

WebUI.verifyElementText(findTestObject('Object Repository/Supplier/Tambah Produk/Pop Up/wording Pop UP'), 'Produk anda sedang masuk pada tahap evaluasi')