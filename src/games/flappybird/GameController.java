package games.flappybird;

import javax.swing.*;

public class GameController {
    public Observable<GameState> gameState;
    public Observable<Integer> score;
    private Timer timer;

    public GameController() {
        gameState = new Observable<>(GameState.INIT);
        score = new Observable<>(0);
    }

    public void startGame() {
        gameState.setValue(GameState.STARTED);
        score.setValue(0);
    }

    public void exit() {
        System.exit(0);
    }

    public void jump() {
        if(gameState.getValue() == GameState.STARTED) {
            //TODO: Jump Logic
        }
    }

    private void addScore() {
        score.setValue(score.getValue()+1);
    }
}
