//2.2
public class lab3 {
    public static void main(String[] args) {
        int money = 0;
        int save = 1;
        int cday = 1;
        while (money < 1000000) {    
            money += save;
            save *= 2;
            cday ++ ;
        }
           
        System.out.println (cday);
    }
}