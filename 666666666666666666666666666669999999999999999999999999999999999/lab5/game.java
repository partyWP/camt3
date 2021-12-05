package lab5;
import java.util.Random;
import java.util.Scanner;

public class game {
public static void main(String[] args) {
//setup
Random rObj = new Random();
int r = rObj.nextInt(99);
Scanner scan = new Scanner(System.in);
boolean chk = true;
/////////////////////////////////////////////////////////////////////////////
System.out.println("guess the number lol xd gg");
while(chk){
//input
int innumber = scan.nextInt();
///output + calculation
//hint
if(innumber > r){
System.out.println("guess lower");
}
if(innumber < r){
System.out.println("guess higher");
}
//win
if(innumber == r){
System.out.println("u win");
chk = false;
}
//lose(give up)
if(innumber == 999){
System.out.println("lol u suck it is " + r);
chk = false;
}


}
scan.close();


}
}