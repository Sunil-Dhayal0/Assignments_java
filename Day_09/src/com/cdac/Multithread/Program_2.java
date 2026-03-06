package com.cdac.Multithread;

class GetTable extends Thread{
	
	             int num1;
	             
	      public GetTable(int x) {
	    	  this.num1 = x;
	      }
	      
	      public void run() {
	    	    PrintTable();
	      }
	
	      public  void  PrintTable(){
			
	    	  for(int i =1; i<=10;i++) {
	    		   
	    		  System.out.println(this.num1+" * "+i+" = "+i*this.num1);
	    		  
	    	  }
		}
}


public class Program_2 {
           public static void main(String[] args) {
			   Thread t1 = new GetTable(10);
		       Thread t2 = new GetTable(20);
		       t1.start();
		       t2.start();
           }
}
