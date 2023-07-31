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

Mobile.tap(findTestObject('01- Informasi Gunung_Features/1.1- Informasi Gunung_Features'), 0)

Mobile.tap(findTestObject('Object Repository/01- Informasi Gunung_Features/2- Jawa Tengah_Features'), 0)

Mobile.scrollToText('Gunung Ungaran')

Mobile.tap(findTestObject('Object Repository/01- Informasi Gunung_Features/2.1- Detailed Information About_Prau'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('01- Informasi Gunung_Features/2- Jawa Tengah_Features'), 0)

Mobile.closeApplication()

