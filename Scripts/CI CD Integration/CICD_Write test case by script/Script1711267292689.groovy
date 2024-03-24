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
import org.codehaus.groovy.ast.Variable as Variable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(URLlink)

WebUI.setText(findTestObject('Page_Guru99 Bank Home Page/input_Email ID_emailid'), 'tranphuocdongla@gmail.com')

WebUI.click(findTestObject('Page_Guru99 Bank Home Page/input_Email ID must not be blank_btnLogin'))

WebUI.waitForElementVisible(findTestObject('Page_Guru99 Bank Home Page/h2_Access details to demo site'), 3000)

WebUI.verifyElementText(findTestObject('Page_Guru99 Bank Home Page/h3_This access is valid only for 20 days'), 3000)

WebUI.acceptAlert()

WebUI.closeBrowser()

