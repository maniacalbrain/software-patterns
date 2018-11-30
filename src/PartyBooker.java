public abstract class PartyBooker {

    public Party bookParty(String type){
        Party party;

        party = createParty(type);

        party.setupPartyArea();
        return party;
    }

    abstract Party createParty(String type);
}
