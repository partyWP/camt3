package lab6;

public class TVmain {
public static void main(String[] args) {
TV tv = new TV();
System.out.println(tv.toString());

tv.powerButton();
tv.setChannel(10);
tv.setVolumeUp();
tv.setVolumeUp();
tv.setVolumeUp();
tv.setVolumeUp();
tv.setVolumeUp();
tv.setVolumeDown();

System.out.println(tv.toString());
}
}