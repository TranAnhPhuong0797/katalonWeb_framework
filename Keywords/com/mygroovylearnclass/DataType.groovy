package com.mygroovylearnclass

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.lang.Float

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

public class DataType {
	static void main(String[] args) {
		//Data type

		//Num => Byte
		byte b = 10;
		println(b);
		println(Byte.MIN_VALUE);
		println(Byte.MAX_VALUE);
		println("=======================");

		//Num => Short
		short s = 100;
		println(s);
		println(Short.MIN_VALUE);
		println(Short.MAX_VALUE);
		println("=======================");

		//Num => Int
		int i = 10000;
		println(i);
		println(Integer.MIN_VALUE);
		println(Integer.MAX_VALUE);
		println("=======================");

		//Num => Long
		long L = 100000;
		println(L);
		println(Long.MIN_VALUE);
		println(Long.MAX_VALUE);
		println("=======================");

		//Num => Float
		float F = 1200.223F;
		println(F);
		println(Float.MIN_VALUE);
		println(Float.MAX_VALUE);
		println("=======================");

		//Num => Double
		double D = 1.223;
		println(D);
		println(Double.MIN_VALUE);
		println(Double.MAX_VALUE);
		println("=======================");

		//Char
		char C = '~';
		println(C);
		println("=======================");

		//Boolean => True/Fail
		boolean Flag = true;
		println(Flag);
		println("=======================");

		//String
		String str = 'Groovy Language';
		println(str);
		println("=======================");
	}
}
