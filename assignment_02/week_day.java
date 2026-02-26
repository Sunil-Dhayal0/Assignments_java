import java.util.*;

public class week_day {
     public static void main(String[] args) {
        System.out.println("enter the number corresponding to which you want to get weekday");

        Scanner sc = new Scanner(System.in);

        int week_num = sc.nextInt();

        switch (week_num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                 System.out.println("monday");
                 break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thrusday");
                break;
            case 6:
                System.out.println("friday");
            case 7:
                System.out.println("saturday");                     
            default:
                System.out.println("number is not in range");
                break;
        }
         sc.close();

     }
}
