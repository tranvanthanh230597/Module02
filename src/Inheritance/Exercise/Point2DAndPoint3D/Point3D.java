package Inheritance.Exercise.Point2DAndPoint3D;
import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public void setZ(float z) {
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getXY()[0],super.getXY()[1], this.z};
    }
    @Override
    public String toString(){
        return "Point3D : "+ Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Point3D arr = new Point3D(1,2,3);
        System.out.println(arr.toString());;
    }
}
