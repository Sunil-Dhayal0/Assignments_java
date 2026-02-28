public class Ques_16 {

    public static void main(String[] args) {  
    //a. int value into String
      int val = 78;
      String str = Integer.toString(val);
      System.out.println(str);
    //b. int value into Integer instance.
      Integer int_instance = Integer.valueOf(val);
      System.out.println(int_instance);
    //c. String instance into Integer instance.
       String str_instance = String.valueOf(str);
       Integer int_instance1 = Integer.valueOf(str_instance);
       System.out.println(int_instance1);
    //d. int value into binary, octal and hexadecimal string
         int num = 2;

         String binary = Integer.toBinaryString(num);
         String octal  = Integer.toBinaryString(num);
         String hexadecimal = Integer.toHexString(num);
         
         System.out.println("binary instance "+binary+" octal_instance "+octal+" hexadecimal_instance "+hexadecimal);
 }
    
}
