package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
       
		Utility utility = new Utility();
		/*System.out.println("Enter start range: ");
		int s1=utility.inputInteger();
		
		System.out.println("enter end range:");
		int s2=utility.inputInteger();*/

		int[] a=utility.primeNumber();
		
		for(int i=0;i<a.length;i++)
			System.out.println(i);
	}

}
