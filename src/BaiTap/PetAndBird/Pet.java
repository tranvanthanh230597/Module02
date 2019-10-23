package BaiTap.PetAndBird;

public abstract class Pet implements ISpeaking{
    private String name;

    public Pet(String name)  {
        this.name = name;
    }

    public Pet() {

    }

    String getName() {
        return name;
    }
    @Override
    public void speak() {
        System.out.println(this.getName()+" speak : ");
    }
}
