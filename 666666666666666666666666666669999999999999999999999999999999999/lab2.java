//2.1
public class lab2 {
    public static void main(String[] args) {
        int money = 0;
        int save = 1;
        for(int i = 0; i <30; i++) {
            money += save;
            save *= 2;
        }
        System.out.println (money);
    }
}