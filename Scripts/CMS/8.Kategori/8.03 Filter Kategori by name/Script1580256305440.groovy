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

WebUI.setText(findTestObject('Page_Jualanmind/input_Email_email'), 'admin_cms2@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Jualanmind/input_Kata Sandi_password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Page_Jualanmind/button_MASUK'))

WebUI.click(findTestObject('Page_Jualanmind/div_Kategori'))

WebUI.click(findTestObject('Page_Jualanmind/td_Sayur'))

WebUI.click(findTestObject('Page_Jualanmind/td_UbahHapus'))

WebUI.setText(findTestObject('Page_Jualanmind/input_ TambahSub Kategori_carikat'), 'Sayur')

WebUI.click(findTestObject('Page_Jualanmind/button_Cari'))

WebUI.click(findTestObject('Page_Jualanmind/button_Cari'))

WebUI.doubleClick(findTestObject('Page_Jualanmind/td_Sayur'))

WebUI.setText(findTestObject('Page_Jualanmind/input_ TambahKategori_carikat'), 'Sayur')

WebUI.click(findTestObject('Page_Jualanmind/button_Cari'))

WebUI.click(findTestObject('Page_Jualanmind/td_Sayur'))

WebUI.click(findTestObject('Page_Jualanmind/td_UbahHapus'))

