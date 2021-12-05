import java.util.Scanner;
public class w2lab2 {
    public static void main(String[] args) {
        double answer; 
        Scanner help = new Scanner(System.in); 
        System.out.print("Pls in put your temperaure (Celsius)");
        answer = tem(help.nextInt());
        help.close();
        System.out.print("Your temperature is " + answer );
        System.out.print("(Fahrenheit)");       
    }
        public static int tem(double x) {
            int help2 = (int) ((9.0/5.0)*x + 32);

            return help2 ;
                        
        }
           

    
    
}
