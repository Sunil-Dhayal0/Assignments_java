import java.util.*;

public class factorial_num {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);           
System.out.println("enter the number , you want that number factorial");     
     int num =  sc.nextInt();
      
       int ans = 1;

      for (int i = num ; i >= 1; i--) {
           ans = ans*i;
          }
  System.out.println("factorial of given number is :\t"+ans);
  sc.close(); 
    }  
}
