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

public class Loop {
	static void main(String[] args) {
		//For statement
		for(int i = 0;i<5;i++) {
			println(i);
		}
		println("=======================");

		//For in statement
		for(int i in 1..5) {
			println(i);
		}
		println("=======================");

		def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

		for(emp in employee) {
			println(emp);
		}
		println("=======================");

		//While statement
		int count = 0;

		while(count<5) {
			println(count);
			count++;
		}


		//Break statement
		int[] array = [0, 1, 2, 3];

		for(int i in array) {
			println(i);
			if(i == 2)
				break;
		}
		println("=======================");

		//Continue statement
		int[] arr = [0, 1, 2, 3];

		for(int i in arr) {
			if(i == 2)
				continue;
			println(i);
		}
		println("=======================");
	}
}
