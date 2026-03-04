import java.lang.Boolean;
public class Ques_06 {
   public static void main(String[] args) {
  
 // 1.boolean value into String

    boolean val = false;
    System.out.println(val);
    String str = String.valueOf(val);
    System.out.println(str);

// boolean value into Boolean instance
    
  boolean bol_instance = Boolean.valueOf(val);
  System.out.println(bol_instance);

// string value into boolean value

    String str1 = "true";
    System.out.println(str1);
    boolean val1 = Boolean.parseBoolean(str1);
    System.out.println(val1);

// string value into boolean instance
 
    boolean bol_instance1 = Boolean.valueOf(str1);
    System.out.println(bol_instance1);


    }
}
