public class ScoreBoard {
    private final Player player1;
    private final Player player2;

    // Constructor
    public ScoreBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public void showScoreBoard(){
        System.out.println("- Name: " + this.player1.getName());
        System.out.println("Score: " + this.player1.getScore());
        System.out.println("- Name: " + this.player2.getName());
        System.out.println("Score: " + this.player2.getScore());
    }

}
