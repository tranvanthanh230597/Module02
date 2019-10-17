package BaiTap.Batterys;

public class Battery {
    private int energy;

    public Battery(int energy) {
        this.energy = energy;
    }
    public Battery(){

    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void decreaseEnergy(){
        if (this.energy > 0 ) {
            this.energy--;
        }
        else{
            System.out.println("Not enough energy to use !!!");
        }
    }
}
