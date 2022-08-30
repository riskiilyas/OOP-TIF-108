package games.flappybird;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController implements ActionListener {
    public Observable<GameState> gameState;
    public Observable<Integer> score;

    public Observable<Integer> birdY;
    private final TileGenerator tileGenerator;
    private final Timer timer;

    public GameController() {
        gameState = new Observable<>(GameState.INIT);
        score = new Observable<>(0);
        timer = new Timer(20, this);
        tileGenerator = new TileGenerator();
    }

    public void startGame() {
        gameState.setValue(GameState.STARTED);
        score.setValue(0);
        timer.start();
    }

    public void exit() {
        System.exit(0);
    }

    public void jump() {
        if(gameState.getValue() == GameState.STARTED) {
            //TODO: Jump Logic
        }
    }

    private boolean checkForBirdIntersection() {
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(gameState.getValue() == GameState.STARTED) {

        } else {
            timer.stop();
        }
    }

    private void addScore() {
        score.setValue(score.getValue()+1);
    }
}
