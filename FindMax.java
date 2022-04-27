package com.bridgelabz.generics;
/*
 * Author: Prasad
 */
public class FindMax {
	/*
	 * Given three integers find the maximum
	 */
	public int findMaximumInteger(Integer num1, Integer num2, Integer num3, Integer max) {
	    max = 0;
	    //compare three numbers
		if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			max = num1;
			System.out.println(num1);
			System.out.println(max + "is maximum");
		}
		else if (num2.compareTo(num3) > 0) {
			max = num2;
			System.out.println(max + "is maximum");
		}
		else {
			max = num3;
			System.out.println(max + "is maximum");
		}
		return max;
	}
	
	/*
	 * This method is to find the maximum number out of three floats
	 */
	public float findMaxFloat(Float num1, Float num2, Float num3, Float max) {
		max = 0.0f;
	    //compare three numbers
			if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
				max = num1;
				System.out.println(num1);
				System.out.println(max + "is maximum");
			}
			else if (num2.compareTo(num3) > 0) {
				max = num2;
				System.out.println(max + "is maximum");
			}
			else {
				max = num3;
				System.out.println(max + "is maximum");
			}
			return max;
	}
}