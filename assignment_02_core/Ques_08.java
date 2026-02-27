public class Ques_08 {
    public static void main(String[] args) {
        // a.byte value into string
          byte a = 5;
          String str = String.valueOf(a);
          System.out.println(str);
       // b.byte value into Byte instance
          byte b = 10;
          byte b_instance = Byte.valueOf(b);
          System.out.println(b_instance);
       // c. String instance into Byte instance.  
           String str1 = "sunil";
           System.out.println(str1);
           Byte b_instance1 = Byte.valueOf(str);         
           System.out.println(b_instance1);
    }
}
