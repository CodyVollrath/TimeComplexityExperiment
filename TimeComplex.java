import java.util.concurrent.TimeUnit;
import java.lang.Math.*;
public class TimeComplex{
    //Data fields for starting and ending time
    private double startTime;
    private double endTime;
    // Algorithims
    public void bestAlgo(int[] arry) {
        startTime();
        int a = arry[1];
        endTime();
        resetTime();

    }
    //O(log_n)
    public void goodAlgo(int[] arry){
        startTime();
        for (int i = 1; i < arry.length; i = i * 2 ){
            System.out.println(arry[i-1] + " ");
        }
        endTime();
        resetTime();
    }

    //O(n)
    public void fairAlgo(int[] arry){
        startTime();
        for (int i = 0; i < arry.length; i++){
            System.out.println(arry[i] + " ");
        }
        endTime();
        resetTime();
    }
    //O(n log_n)
    public void notBadAlgo(int[] arry){
        startTime();
        for (int i = 0;i < arry.length; i++){
            for (int j = 1; j < arry.length; j = j * 2){
                System.out.println("Something: " + arry[j - 1]);
            }
        }
        endTime();
        resetTime();
    }
    //O(n^2)
    public void badAlgo(int[] arry){
        startTime();
        for (int i = 0;i < arry.length; i++){
            for (int j = 1; j < arry.length; j++){
                System.out.println("Something: " + arry[j]);
            }
        }
        endTime();
        resetTime();

    }
    //O(K^n)
    public void veryBadAlgo(int[] arry){
        startTime();
        for (int i = 1; i <= Math.pow(2,arry.length); i++ ){
            System.out.println("Hey - I am busy looging at: " + i);
        }
        endTime();
        resetTime();
    }
    //O(n!)
    public void worstAlgo(int[] arry){
        startTime();
        for (int i= 1; i <= factorial(arry.length); i++){
            System.out.println("Wow: " + factorial(arry.length));
        }
        endTime();
        resetTime();
    }
    //Support Methods for time gathering
    public String getTime(){
        final double timeElapsedNano = endTime - startTime;
        final double timeElapsedMili = timeElapsedNano/1000000;
        return "Execution time in nanoseconds : " + timeElapsedNano + 
                "\nExecution time in milliseconds : " + timeElapsedMili;
    }
    public void resetTime(){
        startTime = 0;
        endTime = 0;
    }
    private void startTime(){
        startTime = System.nanoTime();
    }
    private void endTime(){
        endTime = System.nanoTime();
        System.out.println(getTime());
    }
    // used to decide get factorial number of an integer that is placed into it. 
    private long factorial(int length){
        long fact = 1;
        for (int i = 1; i <= length; i++){
            fact = fact * i;
        }
        return fact;
    }
    
}