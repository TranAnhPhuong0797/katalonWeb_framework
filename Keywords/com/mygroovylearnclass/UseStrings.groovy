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

public class UseStrings {
	static void main(String[] args) {
		String name = 'Phuong Tran';
		def fullName = 'Tran Anh Phuong';

		println('My name is ' + name);
		println(fullName);
		println('==============================');
		
		def multiString = '''My name is Phuong
I'm 26 years old''';
		println(multiString);
		println('==============================');
		
		println(fullName.length());
		
		println(fullName.indexOf('A'));
		
		println(fullName.indexOf('Tran'));
		println('==============================');
		
		println(name.substring(3));
		println(name.subSequence(0, 6));
		println('==============================');
		
		println(fullName.split("Tran "));
		println(fullName-("Anh "));
		println(fullName+(" Anh"));
		println(fullName.replace("Phuong", "Tuan"));
		println('==============================');
		
		println(fullName.toUpperCase());
		println(fullName.toLowerCase());
		println(name.toList());
		println('==============================');
		
		println('age ' *3);
		println(name.equals(fullName));
		println(name.equalsIgnoreCase('phuong tran'));
	}
}
