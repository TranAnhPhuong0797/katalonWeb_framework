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

public class Operator {
	static void main(String[] args) {
		//Arithmetic Operators => Normal arithmetic operators
		assert  1  + 2 == 3;
		assert  4  - 3 == 1;
		assert  3  * 5 == 15;
		assert  3  / 2 == 1.5;
		assert 10  % 3 == 1;
		assert  2 ** 3 == 8;

		//Arithmetic Operators => Unary operators
		assert +3 == 3;
		assert -4 == 0 - 4;

		assert -(-1) == 1;

		//Increment ++ and Decrement --
		/* 
		 * The postfix increment will increment a after the expression has been evaluated and assigned into b
		 * The postfix decrement will decrement c after the expression has been evaluated and assigned into d
		 * The prefix increment will increment e before the expression is evaluated and assigned into f
		 * The prefix decrement will decrement g before the expression is evaluated and assigned into h
		 */
		def a = 2;
		def b = a++ * 3;

		assert a == 3 && b == 6;

		def c = 3;
		def d = c-- * 2;

		assert c == 2 && d == 6;

		def e = 1;
		def f = ++e + 3;

		assert e == 2 && f == 5;

		def g = 4;
		def h = --g + 1;

		assert g == 3 && h == 4;



		//Relational operators

		//		println("=======================");

		//Logical Operators
		assert !false;
		assert true && true;
		assert true || false;


		//Bitwise Operators
		int ExamA = 0b00101010;
		assert ExamA == 42;
		int ExamB = 0b00001000;
		assert ExamB == 8;
		assert (ExamA & ExamA) == a;
		assert (ExamA & ExamB) == ExamB;
		assert (ExamA | ExamB) == ExamA;
		assert (ExamA | ExamB) == ExamA;

		int mask = 0b11111111;
		assert ((ExamA ^ ExamA) & mask) == 0b00000000;
		assert ((ExamA ^ ExamB) & mask) == 0b00100010;
		assert ((~ExamA) & mask)    == 0b11010101;

		//Bit shift operators
		assert 12.equals(3 << 2);
		assert 24L.equals(3L << 3);
		assert 48G.equals(3G << 4);

		assert 4095 == -200 >>> 20;
		assert -1 == -200 >> 20;
		assert 2G == 5G >> 1;
		assert -3G == -5G >> 1;


		//Assignment operators
		def A = 4;
		A += 3;

		assert A == 7;

		def B = 5;
		B -= 3;

		assert B == 2;

		def C = 5;
		C *= 3;

		assert C == 15;

		def D = 10;
		D /= 2;

		assert D == 5;

		def E = 10;
		E %= 3;

		assert E == 1;

		def F = 3;
		F **= 2;

		assert F == 9;


		//Range Operators
		assert 1 + 2 == 3;
		assert 3 != 4;

		assert -2 < 3;
		assert 2 <= 2;
		assert 3 <= 4;

		assert 5 > 1;
		assert 5 >= -2;

		//Conditional operators => Not operator
		assert (!true)    == false;
		assert (!'foo')   == false;
		assert (!'')      == true;

		//Conditional operators => Ternary operator
		//Instead of:
		if (String!=null && String.length()>0) {
			String result = 'Found';
		} else {
			String result = 'Not found';
		}
		//You can write:
		String result = (String!=null && String.length()>0) ? 'Found' : 'Not found';
		//or
		result = String ? 'Found' : 'Not found';
	}
}
