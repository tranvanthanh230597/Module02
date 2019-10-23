package BaiTap.PetAndBird;

public class License{
    private boolean hasLicense;
    private String name;
    private int ID;

    public License(boolean hasLicense, String name, int ID) {
        this.hasLicense = hasLicense;
        this.name = name;
        this.ID = ID;
    }
    public License(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
    public License() {
    }

    public boolean isHasLicense() {
        return hasLicense;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    @Override
    public String toString(){
        if (hasLicense){
            return "This dog has ID: "+this.getID() +" and name: " +this.getName();
        }
        else{
            return "This dog doesn't have license :( ";
        }
    }
}
