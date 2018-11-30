public class TeenPartyFactory extends PartyBooker{

    Party createParty(String type){

        if(type.equals("Arcade")){
            return new TeenArcadeParty();
        }else if(type.equals("Bowl")){
            return new TeenNeonParty();
        }

        return null;
    }
}
