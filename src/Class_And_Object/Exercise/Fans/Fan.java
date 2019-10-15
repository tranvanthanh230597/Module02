package Class_And_Object.Exercise.Fans;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST  = 3;

    private int speed = SLOW;
    private boolean ON = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    public boolean isON() {
        return ON;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setON(boolean ON) {
        this.ON = ON;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){

    }
    public String toString(){
        String status = "The fan has color: "+this.color+", radius: "+this.radius+"." ;
        if(this.ON){
            status += " Fan is on with speed: " + this.speed;
        }
        else{
            status += " Fan is off ";
        }
        return status;
    }
}
