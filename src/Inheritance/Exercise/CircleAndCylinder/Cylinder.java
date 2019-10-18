package Inheritance.Exercise.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public Cylinder() {

    }
    public Cylinder(double radius, double height,String color) {
        this.height = height;
        setColor(color);
        setRadius(radius);
    }
    public double area(){
        return  super.area()*2 + 2* Math.PI * this.getRadius()*this.getHeight() ;
    }
    public double volume(){
        return this.getHeight()*super.area();
    }
    @Override
    public String info(){
        return "The " + getColor() +
                " cylinder is created with the radius is: " + this.getRadius() +
                ". Area is: "+ area() + ", volume is :  " + volume();
    }
}
