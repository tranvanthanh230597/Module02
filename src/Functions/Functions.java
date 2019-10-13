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
        System.out.println("");
    }
    public static boolean checkLocation(int[]arr , int location){
        return (location < 0) || (location > arr.length);
    }

    public static int[][] create2DMatrix(int height , int width){
        int[][]arr = new int[height][width];
        for (int i = 0 ; i <height ; i++){
            for(int j = 0; j < width ; j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        return arr;
    }

    public static void Show2DMatrix(int[][] arr, int height , int width){
        for (int i = 0 ; i < height ; i++){
            for (int j = 0; j < width; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

