import java.util.*;

public class add_num{
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of first number");
        int a = sc.nextInt();
        
        System.out.println("enter the value of second number");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("sum of two number is"+sum);
          
        sc.close();

    }

}