package BaiTap.Human;

public class Human {
    private String name;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }

    public Human(){

    }
    public Human(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public void eat(Apple apple){
        this.weight++;
        apple.decreaseApple();
        System.out.println(this.getName()+ " 's weight : " +this.getWeight());
        System.out.println("Apple 's weight : " + apple.getWeight());
    }
}
