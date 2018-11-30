public abstract class PartyBooker {
    //PartyFactory factory;

    //public PartyBooker(PartyFactory factory){
    //    this.factory = factory;
    //}

    public Party bookParty(String type){
        Party party;

        party = createParty(type);

        party.setupPartyArea();
        return party;
    }

    abstract Party createParty(String type);
}
