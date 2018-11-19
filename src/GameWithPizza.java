import java.util.ArrayList;

public class GameWithPizza extends Game{

    double cost = 10.00;

    public GameWithPizza(ArrayList<String> players){
        super(players);
        System.out.println("Game with pizza started. Cost: €" + Double.toString(baseCost+cost));
    }
}
