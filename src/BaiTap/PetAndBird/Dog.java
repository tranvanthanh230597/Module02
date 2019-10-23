package BaiTap.PetAndBird;

public class Dog extends Pet implements ILicensable {
    private License license;

    Dog(String name, License license) {
        super(name);
        this.license = license;
    }
    @Override
    public void speak(){
        System.out.println("Dog "+ this.getName() + " speak 'go go'");
    }

    @Override
    public License getLicense() {
        return license;
    }
    public void setLicense(License license) {
        this.license = license;
    }
}
