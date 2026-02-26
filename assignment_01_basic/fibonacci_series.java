import java.util.*;

public class fibonacci_series {
     
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter the number that much fibonacci number you want \t");
        int length = sc.nextInt();

         int a = 0;
         int b = 1;

         System.out.print(a+" "+b);

         for (int i = 0; i < length ; i++) {
  
             int c = a+b;
            System.out.print(" "+c); 
             a = b;
             b = c;   


         }
      
         sc.close();

    }
    
}
