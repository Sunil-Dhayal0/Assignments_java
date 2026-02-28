public class Ques_17 {
    public static void main(String[] args) {
        //Integer instance into byte, short, int, long, float and double
       Integer int_instance = Integer.valueOf(23);
       byte  val   =  int_instance.byteValue();
       System.out.println(val);
       short val1  =  int_instance.shortValue();
       System.out.println(val1);
       int   val2  =  int_instance.intValue();
       System.out.println(val2);
       long  val3  =  int_instance.longValue();
       System.out.println(val3);
       float val4  =  int_instance.floatValue();
       System.out.println(val4);
       double val5 =  int_instance.doubleValue();
       System.out.println(val5);
    }
    
}
