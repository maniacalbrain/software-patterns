public class RestrictMaintenance implements MaintenancePermission{
    @Override
    public void maintainLanes() {
        System.out.println("Can Not Maintain Lanes");
    }
}
