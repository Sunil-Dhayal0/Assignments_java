public class Ques_21 {

    public static void main(String[] args) {
        // convert state of Long instance into byte, short, int, long, float and double
        Long long_instance = Long.valueOf(34);
        byte  val          = long_instance.byteValue();
        System.out.println(val);
        short val1         = long_instance.shortValue();
        System.out.println(val1);
        int   val2         = long_instance.intValue();
        System.out.println(val2);
        long  val3         = long_instance.longValue();
        System.out.println(val3);
        float val4         = long_instance.floatValue();
        System.out.println(val4);
        double val5        = long_instance.doubleValue();    
        System.out.println(val5);    
    }
    
}
