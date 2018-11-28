public class RestrictAccessReport implements ReportPermission {
    @Override
    public void accessReports() {
        System.out.println("Can Not Access Reports");
    }
}
