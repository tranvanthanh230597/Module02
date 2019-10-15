package Array_And_Method.Exercise.IllegalTriangleExceptionAssignments;

public class CheckTriangle {
    public static void checkTriangle(int a, int b, int c) throws Exception01,Exception02{
        if( a < 0 || b < 0 || c < 0){
            throw new Exception01("Number can not smaller than 0");
        }
        else if( a+b <= c || a+c <= b || b+c <= a){
            throw new Exception02("This is not triangle...");
        }
        System.out.println("This is triangle :) ");
    }
}
