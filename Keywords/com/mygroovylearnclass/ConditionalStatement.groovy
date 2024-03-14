package com.mygroovylearnclass

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ConditionalStatement {
	static void main(String[] args) {
		//If/Else condition
		def num = 10;
		def result = "";
		if (num < 9) {
			println('Num is less than 10');
		}else if (num == 10) {
			println('Num is equal 10');
		}else {
			println('Num is lager than 10');
		}

		//Switch case condition
		def food = 'burger'

		switch (food) {
			case 'pasta':
				println('Italian food')
				break

			case 'burger':
				println('American food')
				break

			case 'sushi':
				println('Japanese food')
				break

			default:
				println('Unknown food')
				break
		}
	}
}
