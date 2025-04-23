public class TennisGame extends AbstractGame {


    public TennisGame(Player player1, Player player2, ScoreBoard scoreBoard) {
        super(player1, player2, scoreBoard);
    }

    // Implementation of interface method
    @Override
    public void play() {

    }

    // Implementation of interface method
    @Override
    public boolean isGameOver() {
        return false;
    }
}
