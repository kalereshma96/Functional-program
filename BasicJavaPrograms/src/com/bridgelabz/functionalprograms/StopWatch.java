package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	

	
	public static void main(String[] args) {

		
		//StopWatch sw=new StopWatch()
     Utility utility=new Utility();
     System.out.println("press any key to start timer");
      utility.inputInteger();
      utility.start();
  
     
     
     System.out.println("press any key to stop timer");
     utility.inputInteger();
     utility.stop();
   
     
     
      long e =utility.elapse();
      System.out.println("total time elapsed in miliseconds is :"+e);
     System.out.println();
     System.out.println("Time in minutes:"+((e/1000)/60)+ "minutes");
     System.out.println();

     System.out.println("Time in seconds:"+((e/1000)%60)+ "seconds");
     
	}

}
