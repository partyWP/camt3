package lab5;

import java.util.Random;

public class lab5random {
    public static void main(String[] args) {
        Random ran = new Random(1000);
        System.out.println("From randoml ");
        for (int i = 0; i < 50; i++)
        System.out.println(ran.nextInt(100) + " ");

    }
}
