public class Pilot extends CabinCrew{

    private String licenseNumber;

    public Pilot(String name, RankType rank, String licenseNumber){
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }
    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String flyPlane(String instruction){
        return instruction;
    }

}
