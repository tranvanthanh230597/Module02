package Class_And_Object.Exercise.Fans;

public class Ex14_4 {
    public static void main(String[] args) {
        Fan fan01  = new Fan();
        Fan fan02  = new Fan();
        fan01.setSpeed(Fan.FAST);
        fan01.setRadius(10);
        fan01.setColor("yello");
        fan01.setON(true);

        fan02.setSpeed(Fan.MEDIUM);
        fan02.setRadius(5);

        System.out.println(fan01.toString());;
        System.out.println(fan02.toString());;
    }
}
