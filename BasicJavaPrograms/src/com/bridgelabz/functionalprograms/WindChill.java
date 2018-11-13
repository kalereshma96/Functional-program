package com.bridgelabz.functionalprograms;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String[] args) {

       Utility utility=new Utility();
	   double t=Double.parseDouble(args[0]);
	   double v=Double.parseDouble(args[1]);
       utility.windchill(t,v);

	

	 }


}