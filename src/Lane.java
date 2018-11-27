import java.io.Serializable;
import java.util.ArrayList;

public class Lane implements Serializable {

    private static final long serialVersionUID = 1L;
    private int laneNumber;
    Game game = null;

    //Current score
    //Results of previous games

    public Lane(int lane_number) {
        this.laneNumber = lane_number;
        System.out.println("Lane " + Integer.toString(laneNumber) + " online");
    }

    public void start_game(Game game) {
        if(this.game == null){
            this.game = game;
            System.out.println("Game cost: €" + game.cost());
        }else{
            System.out.println("Game already in progress on this lane");
        }
    }

    public void end_game() {
        if(game != null){
            writeToDatabase(laneNumber, game.cost());
            game = null;
            System.out.println("Game ended");
        }else{
            System.out.println("No game in progress");
        }
    }

    public void writeToDatabase(int laneNumber, double cost){
        Database.getInstance().readData(laneNumber, cost);
    }


}
