import java.util.ArrayList;

public class Game{

    ArrayList<String> players;
    ArrayList<Integer> score;
    int current_round = 1;
    double baseCost = 10.00;

    //List of players
    public Game(ArrayList<String> players){
        this.players = players;

        for (String player: players){
            System.out.println(player);
        }
    }

    //get_round

    //simulate round

    //simulate game
    //simulate results and write_results_to_file

    private void write_results_to_file(){
        System.out.println("Game Written to File");
    }
}
