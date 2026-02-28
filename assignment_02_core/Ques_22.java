public class Ques_22 {
     public static void main(String[] args) {
      //find minimum and maximum number as well as to add two long numbers using methods of Long
        long a  = 4;
        long b  = 6;
        long min_val = Long.min(a, b);
        long max_val = Long.max(a, b);
        System.out.println(min_val);
        System.out.println(max_val);
        long sum     = Long.sum(a, b);
        System.out.println(sum);  
     }   
}
