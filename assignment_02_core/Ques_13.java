public class Ques_13 {
    public static void main(String[] args) {

//a. short value into String value
      short val = 7;      
      String str = Short.toString(val);
      
      System.out.println(str);

//b. short value into Short instance.
      
    Short short_instance = Short.valueOf((short)val);
    System.out.println(short_instance);

//c. String instance into Short instance.
      
     String str1 = "48";

     String str_instance = String.valueOf(str1);
     Short short_instance1 = Short.valueOf(str_instance);
     System.out.println(short_instance1);

}
}
