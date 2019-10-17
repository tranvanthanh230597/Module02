package BaiTap.Batterys;

public class FlashLamp {
    private String nameLamp;
    private boolean ON = false;

    public String getNameLamp() {
        return nameLamp;
    }
    public void setNameLamp(String nameLamp) {
        this.nameLamp = nameLamp;
    }
    public boolean isON() {
        return ON;
    }
    public void setON(boolean ON) {
        this.ON = ON;
    }
    public FlashLamp(boolean ON) {
        this.ON = ON;
    }
    public FlashLamp(String lampName, boolean ON){
        this.nameLamp=lampName;
        this.ON = ON;
    }
    public void turnOn(Battery battery){
       if (!ON){
           ON = true;
           battery.decreaseEnergy();
           System.out.println("OK.... "+ this.nameLamp +" was turned on !!!");
           System.out.println("battery has : " + battery.getEnergy()+" energy");
       }
       else{
           System.out.println(this.nameLamp + " is on");
       }
    }
    public void turnOff(Battery battery){
        if(ON){
            ON = false;
            System.out.println("OK.... "+ this.nameLamp +" was turned off !!!");
            System.out.println("battery has : " + battery.getEnergy()+" energy");
        }
        else{
            System.out.println(this.nameLamp + " is off");
        }
    }
}
