public class reverse_num {
    public static void main(String[] args) {
         int num = 1234;
         int reverse_n = 0;

while (num != 0) {
   
    int last_num = num%10;
  reverse_n = reverse_n*10 + last_num;
     num = num/10;
           
}
 
System.out.print(reverse_n);

    }    
}
