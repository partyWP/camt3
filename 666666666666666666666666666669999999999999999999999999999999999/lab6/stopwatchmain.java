package lab6;

public class stopwatchmain {

    public static void main(String[] args) {
        int size = 100000;

        stopwatch stopwatch = new stopwatch();
        for(int i = 0; i < size; i++)
        System.out.println("Hello java");
        stopwatch.stop();

        System.out.println("The process time is " + stopwatch.getElapseTime() + " milliseconds ");

              
    }
    
}
