import java.io.Serializable;
import java.util.ArrayList;

public class LaneAdapter extends Lane implements LaneInterface {

    //private static final long serialVersionUID = 1L;
    //private int laneNumber;
    //Game game = null;

    //Current score
    //Results of previous games

    public LaneAdapter(int lane_number) {
        super(lane_number);
        //this.laneNumber = lane_number;
        //System.out.println("Lane " + Integer.toString(laneNumber) + " online");
    }

    public void startGame(Game game) {
        start_game(game);
    }

    public void endGame() {
        end_game();
    }


}
