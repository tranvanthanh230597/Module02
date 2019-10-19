package Inheritance.Exercise.PointAndMoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float ySpeed,float xSpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getspeed(){
        return new float[]{xSpeed,ySpeed};
    }
    @Override
    public String toString(){
        return super.toString()+"speed = "+ Arrays.toString(getspeed());
    }
    public void move(){
        setX(getX()+this.xSpeed);
        setY(getY()+this.ySpeed);
    }
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(4,4,1,2);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

    }
}
