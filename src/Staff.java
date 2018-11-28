public class Staff {

    String name;

    TillPermission tp;
    ReportPermission rp;
    MaintenancePermission mp;

    public Staff(String name, TillPermission tp, ReportPermission rp, MaintenancePermission mp){

        this.name = name;
        this.tp = tp;
        this.rp = rp;
        this.mp = mp;
    }

    public void accessTill(){
        this.tp.accessTill();
    };

    public void accessReports(){
        this.rp.accessReports();
    };

    public void maintainLanes(){
        this.mp.maintainLanes();
    }
}
