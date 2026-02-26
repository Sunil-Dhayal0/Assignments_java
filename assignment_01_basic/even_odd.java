import java.util.Scanner;

public class even_odd {
     public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number: \t");
          int value = sc.nextInt();
          
          if (value%2 == 0) {
            System.out.println("enter number is even");
          }else{
            System.out.println("enter number is odd ");
          }
       sc.close();   
    }
}
