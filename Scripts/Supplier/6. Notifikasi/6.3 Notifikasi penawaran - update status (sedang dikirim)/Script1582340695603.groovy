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

WebUI.click(findTestObject('Object Repository/Supplier/Beranda/Menu/Notifikasi'))

WebUI.click(findTestObject('Object Repository/Supplier/Notifikasi/Nottifikasi - Penawaran'))

WebUI.scrollToElement(findTestObject('Object Repository/Supplier/Notifikasi/Penawaran - Pilih Sedang diproses'), 5)

WebUI.click(findTestObject('Object Repository/Supplier/Notifikasi/Penawaran - Pilih Sedang diproses'))

WebUI.click(findTestObject('Object Repository/Supplier/Notifikasi/Penawaran - button UPDATE STATUS KIRIM'))

WebUI.check(findTestObject('Object Repository/Supplier/Notifikasi/Check Terbayar - Sedang Dikirim'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Supplier/Notifikasi/Button PROSES'))

WebUI.click(findTestObject('Object Repository/Supplier/Notifikasi/Button Proses Confirmation'))