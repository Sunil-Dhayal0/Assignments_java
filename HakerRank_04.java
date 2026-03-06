import java.util.Scanner;

public class HakerRank_04 {
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           String name = sc.nextLine();

           int counts[] = new int[123];

             for (int i = 0; i < name.length(); i++) {
                
                  System.out.println(name.charAt(i));

                    counts[name.charAt(i)]++;
             }

             for (int i = 65; i < 123; i++) {
                   if (counts[i] > 1) {
                       System.out.println((char)i+"repeat"+counts[i]+"times"); 
                   }
             }

            
            sc.close();   
      }
}
