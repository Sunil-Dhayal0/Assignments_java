public class Ques_24 {
    public static void main(String[] args) {
     //a. float value into String.
        float n = 0.9f;   
     String str = Float.toString(n);
      System.out.println(str);
     //b. float value into Float instance.
         Float float_instance = Float.valueOf(n);
         System.out.println(float_instance);
     //c. String instance into Float instance.
         String str_instance = String.valueOf(str);
         Float float_instance1 = Float.valueOf(str_instance); 
         System.out.println(float_instance1);  
     //d. float value into hexadecimal string.
          String hexa = Float.toHexString(n);
          System.out.println(hexa);
    }
}
