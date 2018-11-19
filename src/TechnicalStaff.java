public class TechnicalStaff extends Staff{

    public TechnicalStaff(String name){
        super(name);
    }

    public void accessTill(){
        System.out.println("Can access Till");
    }

    public void accessReports(){
        System.out.println("Can access reports");
    }

    public void maintainLanes(){
        System.out.println("Can carry out lane maintainance");
    }
}
