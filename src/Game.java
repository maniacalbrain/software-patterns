import java.util.ArrayList;

public class Game {

    private ArrayList<String> players;
    private ArrayList<Integer> score;
    private int current_round = 1;
    //Cost?

    //List of players
    public Game(ArrayList<String> players){
        this.players = players;
        System.out.println("Game started");

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
