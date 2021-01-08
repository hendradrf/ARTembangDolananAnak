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

Mobile.startApplication('C:\\Users\\hendradrf\\Downloads\\ar-tembang-dolanan-anak_1.0.14.apk', true)

Mobile.tap(findTestObject('Object Repository/android.view.View (5)'), 0)

'Tap on the book icon to see the description'
Mobile.tap(findTestObject('Object Repository/android.view.View (6)'), 0)

'Tap on the question mark icon to know how to play'
Mobile.tap(findTestObject(''), 0)

'Tap on the movement icon to see the movement gesture '
Mobile.tap(findTestObject(''), 0)

'Tap on the chord icon to see the lyric and chord of the song'
Mobile.tap(findTestObject(''), 0)

'Tap on the youtube icon to see the video on youtube'
Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

