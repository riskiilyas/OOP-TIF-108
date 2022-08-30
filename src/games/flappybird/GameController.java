package games.flappybird;

public class GameController {
    public Observable<GameState> gameState;
    private int score = 0;

    public void startGame() {

    }

    public int addScore() {
        return ++score;
    }

    public int getScore() {
        return score;
    }
}
