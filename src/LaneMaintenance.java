import java.util.ArrayList;

public class LaneMaintenance implements Observer {
    private Subject database;
    private int laneNumber;
    private double cost;
    private ArrayList<String> players;
    
    public LaneMaintenance(Subject lane){
        this.database = database;
        lane.registerObserver(this);
    }

    public void update(int laneNumber, double cost){
        this.laneNumber = laneNumber;
        this.cost = cost;
        writeToMaintenanceDatabase();
    }

    public void writeToMaintenanceDatabase(){
        System.out.println("Data for Lane " + Integer.toString(laneNumber) + ", cost of €" + Double.toString(cost) + " written to database.");
    }
}
