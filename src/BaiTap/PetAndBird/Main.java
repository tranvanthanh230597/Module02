package BaiTap.PetAndBird;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("chim");
        Dog lu = new Retriever("Lu",new License(false));

        System.out.println(lu.getName());;
        ((Retriever) lu).retriever(bird);

        Dog milu = new Dog("Milu",new License(true,"Milu", 73));
        System.out.println(milu.getLicense());
        System.out.println(lu.getLicense());
    }
}
