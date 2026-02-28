public class Ques_14 {
    public static void main(String[] args) {
// convert state of Short instance into byte,short, int, long, float and double.
   
   short val = 67;
   Short short_instance = Short.valueOf(val);

   
    byte val1 =  short_instance.byteValue();
    System.out.println(val1);
    short val2 = short_instance.shortValue();
    System.out.println(val2);
    int val3  = short_instance.intValue();
    System.out.println(val3);
    long val4 = short_instance.longValue();
    System.out.println(val4);
    float val5 = short_instance.floatValue();
    System.out.println(val5);
    double val6 = short_instance.doubleValue();
    System.out.println(val6);

}
}
