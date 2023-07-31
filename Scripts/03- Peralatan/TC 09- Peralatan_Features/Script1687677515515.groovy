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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('D:\\2. Eduporto\\Automate\\PendakiMobileApp\\MobileApp\\app-pendaki.apk', true)

Mobile.tap(findTestObject('01- Informasi Gunung_Features/1- Line3_Button'), 0)

Mobile.tap(findTestObject('Object Repository/03- Peralatan_Features/9- Peralatan_Features'), 0)

Mobile.tap(findTestObject('Object Repository/03- Peralatan_Features/9.1- Peralatan_Tenda'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/03- Peralatan_Features/9.2- Peralatan_Makanan Logistik'), 0)

Mobile.pressBack()

Mobile.scrollToText('Gaiter')

Mobile.getText(findTestObject('Object Repository/03- Peralatan_Features/9.3- Peralatan_Assertion'), 0)

Mobile.closeApplication()

