package Advanced_Object_Oriented_Design.Exercise.Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle cir = new Circle(10);
        Rectangle rect = new Rectangle(10,20);
        Square square = new Square(10);

        System.out.println(cir.toString());
        System.out.println(rect.toString());
        System.out.println(square.toString());

        cir.resize(Math.random()*100+1);
        rect.resize(Math.random()*100+1);
        square.resize(Math.random()*100+1);

        System.out.println("-----------------------------");
        System.out.println(cir.toString());
        System.out.println(rect.toString());
        System.out.println(square.toString());
    }
}
