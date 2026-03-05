import java.util.Scanner;

public class HakerRankProblem2 {
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n1 = sc.nextInt();
           int n2 = sc.nextInt();
           

           for (int i = n1; i <= n2; i++) {
           
            int num = n1;
         
             int number = 0;
  
        while (num != 0) {
            int a = num%10;
             number = number+a*a*a;
            num/=10;
        }
        
        if (number == n1) {
            System.out.print(number+" ");
            
        }
        n1++;
       

    }
    sc.close();
  }
     

            
         
}
