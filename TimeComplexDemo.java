import java.lang.*;
public class TimeComplexDemo{

    public static void main(String[] args){
     //Call methods related to timeComplexity in the several classes
     int[] arryTwo = {1, 2,3, 4, 5, 6, 7};
     TimeComplex test = new TimeComplex();
    test.bestAlgo(arryTwo);
    test.goodAlgo(arryTwo);
    test.fairAlgo(arryTwo);
    test.notBadAlgo(arryTwo);
    test.badAlgo(arryTwo);
    test.veryBadAlgo(arryTwo);
    test.worstAlgo(arryTwo);
    }
}