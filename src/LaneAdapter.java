public class LaneAdapter extends Lane implements LaneInterface {

    public LaneAdapter(int lane_number) {
        super(lane_number);
    }
    public void startGame(Game game) {
        start_game(game);
    }
    public void endGame() {
        end_game();
    }
}
