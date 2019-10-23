package BaiTap.PetAndBird;

public class Retriever extends Dog{

    Retriever(String name, License license) {
        super(name, license);
    }
    @Override
    public void speak(){
        System.out.println(this.getName()+" speak 'go go'");
    }
    public void retriever(Bird bird){
        System.out.println(this.getName()+" retriever " + bird.getName());
    }
}
