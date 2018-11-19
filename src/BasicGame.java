import java.util.ArrayList;

public class BasicGame extends Game{

    double cost = 0;

    public BasicGame(ArrayList<String> players){
        super(players);
        System.out.println("Basic Game started. Cost: €" + Double.toString(baseCost+cost));
    }
}
