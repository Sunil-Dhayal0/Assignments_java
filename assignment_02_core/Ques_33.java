
public class Ques_33 {
    public static void main(String[] args) {
        // Pass integer, float and double value from command line. Parse 
        //  it appropriately and perform arithmetic operations (+,-,*,/)
        //  on it.
           if (args.length == 4) {
              int    val_i = Integer.parseInt(args[0]);
              float  val_f = Float.parseFloat(args[1]);
              double val_d = Double.parseDouble(args[2]);
              String   opr   = args[3];

              double result = 0;
              switch (opr) {
                case "+":
                        result = val_i+val_f+val_d;
                       System.out.println(result);
                    break;
                case "-":
                       result = val_i+val_f+val_d;
                       System.out.println(result);
                       break;
                case "*":
                       result = val_i+val_d+val_f;
                       System.out.println(result);
                       break;
                case "/":
                       result = val_d+val_f+val_i;
                       System.out.println(result);
                       break;       
                default:
                       System.out.println("undefined");
                    break;
              }  
           }else{
              System.out.println("Error: you hadn't write all arrgument\n Please write in formate Int,Float,Double and Operator");
           }

    }
}
