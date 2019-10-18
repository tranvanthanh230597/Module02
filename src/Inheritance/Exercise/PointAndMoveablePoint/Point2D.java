package Inheritance.Exercise.PointAndMoveablePoint;

import Functions.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = new float[]{this.x,this.y};
        return xy;
    }
    @Override
    public String toString(){
        return "Point2D : "+ Arrays.toString(getXY());
    }
}
