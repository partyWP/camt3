package lab6;

public class stopwatch {
//datafield
private long startTime = 0;
private long stopTime = 0;

public void start(){
startTime = System.currentTimeMillis();
}
public void stop(){
stopTime = System.currentTimeMillis();
}
public long getElapseTime(){
return stopTime - startTime;

}
}
