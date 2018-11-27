import java.util.ArrayList;

public class Cafe extends GameDecorator {

    Game game;
    public double cost = 5.00;

    public Cafe(Game game){
        this.game = game;
    }

    public double cost(){
        return cost + game.cost();
    }
}
