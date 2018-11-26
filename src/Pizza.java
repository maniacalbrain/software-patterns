public class Pizza extends GameDecorator {

    Game game;
    public double cost = 10.00;

    public Pizza(Game game){
        this.game = game;
    }

    public double cost(){
        return cost + game.cost();
    }
}
