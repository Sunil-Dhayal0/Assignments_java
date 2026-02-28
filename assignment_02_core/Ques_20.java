public class Ques_20 {
    public static void main(String[] args) {
//a. long value into String
         long val = 34;
         String str = Long.toString(val);
//b. long value into Long instance.
         Long long_instance  = Long.valueOf(val);
         System.out.println(long_instance);
//c. String instance into Long instance.
         String str_instance   = String.valueOf(str);
         Long   long_instance1 = Long.valueOf(str_instance);
         System.out.println(long_instance1);
//d. long value into binary, octal and hexadecimal string.
         String binary = Long.toBinaryString(val);
         System.out.println(binary);
         String octal  = Long.toOctalString(val);
         System.out.println(octal);
         String hexadecimal = Long.toHexString(val);
         System.out.println(hexadecimal);
        }
}
