package com.bridgelabz.functionalprograms;
import java.util.Scanner;

public class Permutation {

	
	public static void permutation(String input) {
		permutation("",input);
	}
	
	
public static void permutation(String str,String word) {
	
	if( word.isEmpty()) {
		System.out.println(str + word);
	}
    for( int i=0; i < word.length(); i++) {
    	
        permutation(str + word.charAt(i), word.substring(0, i) + word.substring(i + 1,word.length()));
    	
    }
   
}
public static void main(String[] args) {
	
		System.out.println("enter string:\n");	
		Scanner scan=new Scanner(System.in);
		String n=scan.next();
}
}