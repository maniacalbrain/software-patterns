import java.util.ArrayList;

public class Database implements Subject {

    private ArrayList observers;
    private static Database databaseInstance;

    private int laneNumber;
    private double cost;
    //private int players;

    private Database(){
        observers = new ArrayList();
    }

    public static Database getInstance(){
        if(databaseInstance == null){
            databaseInstance = new Database();
        }
        return databaseInstance;
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(laneNumber, cost);
        }
    }

    public void readData(int laneNumber, double cost){
        this.laneNumber = laneNumber;
        this.cost = cost;
        notifyObservers();
    }

}


