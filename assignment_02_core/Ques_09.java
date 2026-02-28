import java.lang.Byte;
public class Ques_09 {
       public static void main(String[] args) {
         
        byte val = 2;                    
        Byte byte_instance = Byte.valueOf(val);  // Byte instance from byte
        System.out.println(byte_instance);
     
        //1.byte
         byte val1 =  byte_instance.byteValue();      // Byte instance to byte
         System.out.println(val1);
        //2.short
        short short_val = byte_instance.shortValue();
        System.out.println(short_val);
        //3. int 
        int int_val = byte_instance.intValue();
        System.out.println(int_val);
        //4. long
        long long_val = byte_instance.longValue();
        System.out.println(long_val);
        //5. float
        float float_val = byte_instance.floatValue();
        System.out.println(float_val);
        //6.double
        double double_val = byte_instance.doubleValue();
        System.out.println(double_val);
       }    
}
