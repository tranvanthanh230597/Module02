package BaiTap.PetAndBird;

public class Bird implements ISpeaking {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Bird() {
    }
    @Override
    public void speak() {
        System.out.println("Bird speak: ");
    }
}
