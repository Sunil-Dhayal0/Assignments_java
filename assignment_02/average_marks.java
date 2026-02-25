import java.util.*;

public class average_marks{
	
	public static void main(String[]args){
		
		System.out.println("Enter your math marks :\t");
		Scanner math = new Scanner(System.in);
		
		int math_marks = math.nextInt();
		
		System.out.println("Enter your English marks :\t");
		 Scanner english =  new Scanner(System.in);
		 
		int english_marks = english.nextInt(); 
		 
		System.out.println("Enter your History marks :\t");
		 Scanner history =  new Scanner(System.in);
		 
		int history_marks = history.nextInt();  
		 
		 int avg_marks =  (math_marks+english_marks+history_marks)/3;
		 
		 if(avg_marks >= 90 ){
			  System.out.println("Grade A");
		 }else if(avg_marks >= 70 && avg_marks <= 89){
		      System.out.println("Grade B");
		 }else if(avg_marks >= 50 && avg_marks <= 69){
			  System.out.println("Grade C");
		 }else if(avg_marks >= 30 && avg_marks <= 49){
			  System.out.println("Grade D");
		 }else if(avg_marks < 30){
			 System.out.println("you are failed ! , try again good luck");
		 } else{
			 System.out.println("undefined");
		 }
		
		  math.close();
		  english.close();
		  history.close();
		
	}
}