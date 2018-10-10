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

    public void start_game(ArrayList<String> players) {
        game = new Game(players);
    }

    private void end_game() {
        game = null;
    }
}
