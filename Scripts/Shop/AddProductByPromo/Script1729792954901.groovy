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

Mobile.startApplication('androidapp\\HappyDayShopping.apk', true)

Mobile.tap(findTestObject('Object Repository/Shop/PromoSale/promo_menu'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/PromoSale/Product _LeoMens100ml'), 0)

//Mobile.tap(findTestObject('Object Repository/Shop/PromoSale/quantity_input'), 0)
//Mobile.setText(findTestObject('Object Repository/Shop/PromoSale/quantity-5_input'), '5', 0)
//Mobile.hideKeyboard()
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shop/PromoSale/AddToBag_button'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/PromoSale/YourBag_button'), 0)

Mobile.tap(findTestObject('Object Repository/Shop/PromoSale/Checkout_button'), 0)

Mobile.getText(findTestObject('Object Repository/Shop/PromoSale/text-assertions-after-checkout'), 0)

Mobile.closeApplication()

