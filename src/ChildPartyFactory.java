public class ChildPartyFactory extends PartyBooker {

    Party createParty(String type){
        if(type.equals("Bowl")){
            return new KidsBowlParty();
        } else if(type.equals("Play")){
            return new KidsPlayParty();
        }

        return null;
    }
}