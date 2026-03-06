package com.cdac.Multithread;

class Test implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0;i <=10;i++) {
			 
			System.out.println("Thread Name -> "+Thread.currentThread().getName()+" i: -> "+i+" priority: ->"+Thread.currentThread().getPriority());
			
		}

		
	}
	
	         
	
}

public class Program {
           public static void main(String[] args) {
//			   System.out.println("Thread Name: "+Thread.currentThread().getName());
//			   System.out.println("Thread Id: "+Thread.currentThread().getId());
//			   System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
			   
        	   
//			  Runnable t1 = new Test();
//			  
//			   Thread th2 = new Thread(t1);
//			   
//			   th2.setName("Thread-One");
			   
        	   Thread t1 = new Thread(new Test());
        	   Thread t2 = new Thread(new Test());
        	   t1.setName("th1");
        	   t2.setName("th2");
        	   
			   t1.start();
			   t2.start();
			   
		}
}
