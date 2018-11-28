public class RestrictAccessTill implements TillPermission {

    @Override
    public void accessTill() {
        System.out.println("Can Not Access Till");
    }
}
