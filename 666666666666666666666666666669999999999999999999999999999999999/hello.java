import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        myObj.close();
        System.out.println("pls in put you number");
        int num1 = myObj.nextInt();
        if (num1 < 500) 
        {System.out.println("your value is too low :(");}
            
         else 
        {System.out.println("your value is high enough :)");}
            
        
        
        
    }
}