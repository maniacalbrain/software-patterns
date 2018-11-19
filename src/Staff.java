public abstract class Staff {

    String name;

    public Staff(String name){
        this.name = name;
    }

    public abstract void accessTill();

    public abstract void accessReports();
}
