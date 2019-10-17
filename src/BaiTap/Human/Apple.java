package BaiTap.Human;

public class Apple {
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public Apple(int weight) {
        this.weight = weight;
    }
    public Apple(){

    }
    public void decreaseApple(){
        if(weight > 0){
            weight--;
        }
        else{
            System.out.println("not enough Apple to eat");
        }
    }
}
