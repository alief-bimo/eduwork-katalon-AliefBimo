import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.RenderingHints.Key as Key
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import javax.swing.KeyStroke as KeyStroke
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
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

TestObject SearchFormField = findTestObject('ShopSamsung/SearchForm')

Mobile.startApplication('C:\\Users\\Bimo\\Katalon Studio\\EduApp_AliefBimo\\androidapp\\Shop Samsung_2.0.34917_APKPure.apk', 
    true)

Mobile.tap(findTestObject('ShopSamsung/GuestButton'), 0)

Mobile.tap(findTestObject('ShopSamsung/Continue2.Button'), 0)

Mobile.tap(findTestObject('ShopSamsung/SearchFormButton'), 0)

Mobile.sendKeys(SearchFormField, 'Galaxy')

Mobile.tap(SearchFormField, 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ShopSamsung/SuggestedItem01.View'), 0)

// Mendapatkan AndroidDriver dari session yang sudah berjalan
//AndroidDriver<?> driver = MobileDriverFactory.getDriver() 
// Memicu event key "Enter"
//driver.pressKey(new KeyEvent(AndroidKey.ENTER))
Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

