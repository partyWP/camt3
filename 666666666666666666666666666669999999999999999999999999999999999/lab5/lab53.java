package lab5;
import java.util.Random;
public class lab53 {
    
    public static void main(String[] args) {
        Random ran = new Random();
        int ra = 20 + ran.nextInt(21);
        System.out.println("The sin of " + ra + " is " + Math.sin(ra));
        System.out.println("The cosine of " + ra + " is " + Math.sin(ra));
        System.out.println("The tangent of " + ra + " is " + Math.sin(ra));
    }
}
