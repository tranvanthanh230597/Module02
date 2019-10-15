package Class_And_Object.Exercise.StopWatchs;

import Functions.Functions;

public class EX14_3 {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.startTime();
        int[] arr = Functions.createMatrix(1000);
        Functions.show(Functions.sortASC(arr));
        watch.endTime();
        System.out.println("selection sort 1000 value has: " + watch.getElapsedTime() + " milisecond");
    }
}
