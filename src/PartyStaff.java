public class PartyStaff extends Staff{

    public PartyStaff(String name){
        super(name);
    }

    public void accessTill(){
        System.out.println("Cannot access Till");
    }

    public void accessReports(){
        System.out.println("Cannot access reports");
    }
}
