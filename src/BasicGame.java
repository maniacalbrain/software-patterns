import java.util.ArrayList;

public class BasicGame implements Game{

    ArrayList<String> players;
    ArrayList<Integer> score;
    int current_round = 1;
    double cost = 10.00;

    public BasicGame(ArrayList<String> players){

        this.players = players;

        for (String player: players){
            System.out.println(player);
        }
    }

    public double cost(){
        return cost;
    }

    //public ArrayList<String> getPlayers(){ return players;}


}
