package Inheritance.Exercise.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;



    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public Circle(){

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double area(){
        return  Math.pow(radius,2) * Math.PI;
    }
    public String info() {
        return "The " + getColor() +
                " circle is created with the radius is: " + radius +
                ". Area is: "+ area();
    }
}
