import java.util.*;

public class sum_natural_num {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of natural number sum you want :\t");
         int n = sc.nextInt();
         int sum = 0;
         for (int i = 1; i <= n; i++) {
             sum+=i;
         }

         System.out.println("sum of natural number is"+sum);

         sc.close();
     }
}
