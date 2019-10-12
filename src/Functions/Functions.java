package Functions;

public class Functions {
    public static int[] createMatrix(int num){
        int[]arr = new int[num];
        for (int i = 0 ; i <num ; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    public static void show(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }
}
