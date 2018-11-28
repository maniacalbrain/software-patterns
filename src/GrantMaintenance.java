public class GrantMaintenance implements MaintenancePermission {
    @Override
    public void maintainLanes() {
        System.out.println("Can Maintain Lanes");
    }
}
