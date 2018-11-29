public class KidsPlayParty extends Party {

    public KidsPlayParty(){
        super();
        System.out.println("Kids Play Party Booked");
        assignStaff();
    }

    public void assignStaff(){
        System.out.println("Party Staff Assigned");
    }

    public void setupPartyArea(){
        System.out.println("Party Area Set up");
    }
}
