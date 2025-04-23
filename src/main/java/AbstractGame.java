public abstract class AbstractGame implements Game {

    private Player player1, player2;
    private ScoreBoard scoreBoard;

    public AbstractGame(Player player1, Player player2, ScoreBoard scoreBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.scoreBoard = scoreBoard;
    }
}
