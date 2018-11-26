import java.io.Serializable;
import java.util.ArrayList;

public class Lane implements Serializable {

    private static final long serialVersionUID = 1L;
    private int lane_number;
    Game game = null;
    //Current players
    //Current score
    //Results of previous games

    public Lane(int lane_number) {
        this.lane_number = lane_number;
        System.out.println("Lane " + Integer.toString(lane_number) + " online");
    }

    public void start_game(Game game) {
        if(this.game == null){
            this.game = game;
            System.out.println("Game cost: €" + game.cost());
        }else{
            System.out.println("Game already in progress on this lane");
        }
    }

    public void start_game_pizza(ArrayList<String> players) {
        if(game == null){
            //game = new GameWithPizza(players);
        }else{
            System.out.println("Game already in progress on this lane");
        }
    }

    public void start_game_cafe(ArrayList<String> players) {
        if(game == null){
            //game = new GameWithCafe(players);
        }else{
            System.out.println("Game already in progress on this lane");
        }
    }

    public void end_game() {
        if(game != null){
            game = null;
            System.out.println("Game ended");
        }else{
            System.out.println("No game in progress");
        }
    }
}
