import java.util.*;

public class leep_year {
      
    public static void main(String[] args){
        
        System.out.println("enter the year");

        Scanner sc = new Scanner(System.in);

        int year =  sc.nextInt();


         if (year%4 == 0 && year%400 == 0) {
              System.out.println("enter year is leap year");
         }else{
            System.out.println("enter year is not a leap year");
         }

         sc.close();

    }
    
}