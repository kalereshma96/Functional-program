package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

public class AnagramDetect {

	public static void main(String[] args) {
		Utility utility=new Utility();
		System.out.println("Enter first string..");
    String str1=utility.inputString();
    System.out.println("enter 2nd string:");
    String str2 = utility.inputString();
    String str3 = str1.replaceAll("\\s+",  " ");
    String str4 = str2.replaceAll("\\s+",  " ");

    utility.anagram(str3,str4);  
    
	}

}
