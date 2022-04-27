package com.bridgelabz.generics;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
/*
 * Author: Prasad
 */
class FindMaxTest {
	/*
	 * Test case to check maximum number is at first position
	 */
	@Test
	public void maxNumberAtFirstPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		//object
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num1;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum number is at second position
	 */
	@Test
	public void maxNumberAtSecondPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num2;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum number is at third position
	 */
	@Test
	public void maxNumberAtThirdPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer number");	
		Integer num1 = sc.nextInt();
		System.out.println("Enter second integer number");
		Integer num2 = sc.nextInt();
		System.out.println("Enter third integer number");
		Integer num3 = sc.nextInt();
		Integer max = null;
		FindMax findMax = new FindMax();
		int actualResult = findMax.findMaximumInteger(num1, num2, num3, max);
		int expectedResult = num3;
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	/*
	 * Test case to check maximum float number is at first position
	 */
	@Test
	public void maxFloatAtFirstPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num1;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
	
	/*
	 * Test case to check maximum float number is at second position
	 */
	@Test
	public void maxFloatAtSecondPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num2;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
	
	/*
	 * Test case to check maximum float number is at third position
	 */
	@Test
	public void maxFloatAtThirdPosition() {
		//Input numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first float number");	
		Float num1 = sc.nextFloat();
		System.out.println("Enter second float number");
		Float num2 = sc.nextFloat();
		System.out.println("Enter third float number");
		Float num3 = sc.nextFloat();
		Float max = null;
		//object
		FindMax findMax = new FindMax();
		float actualResult = findMax.findMaxFloat(num1, num2, num3, max);
		float expectedResult = num3;
		//Test condition
		Assert.assertEquals(expectedResult, actualResult, 0.0f);
	}
}
