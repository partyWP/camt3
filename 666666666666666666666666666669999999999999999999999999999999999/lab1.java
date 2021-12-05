import java.util.Scanner;
public class lab1 {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in); 
            System.out.println ("Welcome to OOP lab \n 1. menu 1 \n 2. menu 2 \n 3. menu 3 \n 4. menu 4 \n 5. Bye Bye \n enter number ");
             int num3 =myObj.nextInt();
             myObj.close();
                
            if (num3 == 1) {
                System.out.println ("Welcome to menu 1");
             }
            else if (num3 == 2) {
                System.out.println ("Welcome to menu 2");
            }
            else if (num3 == 3) {
                System.out.println ("Welcome to menu 3");
            }
            else if (num3 == 4) {
                System.out.println ("Welcome to menu 4");
            }
            else if (num3 == 5) {
                System.out.println ("Bye Bye see you tomorrow and hace a nice day");
            }
        }
}
