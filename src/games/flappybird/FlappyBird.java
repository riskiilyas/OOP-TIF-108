package games.flappybird;

import javax.swing.*;
import java.awt.*;

public class FlappyBird extends JFrame implements GameStateObservable.OnGameStateChangedListener {

    private final GameStateObservable gameStateObservable;
    private final JPanel sky = new JPanel();
    private final JPanel ground = new JPanel();
    private final JPanel grass = new JPanel();
    private final JButton playButton = new JButton();
    private final JButton exitButton = new JButton();
    private final JLabel title = new JLabel();
    private final JLabel score = new JLabel();

    private int mScore = 0;

    public FlappyBird() {
        initScenario();

        gameStateObservable = new GameStateObservable(GameState.INIT);
        gameStateObservable.observe(this);
    }

    private void initScenario() {
        score.setText("Score: NULL");
        score.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        score.setBounds(180, 90, 200, 30);
        score.setVisible(false);

        title.setText("Flappy Bird");
        title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
        title.setBounds(140, 20, 300, 50);
        title.setVisible(false);

        playButton.setBounds(150, 150, 200, 50);
        playButton.setVisible(false);
        playButton.addActionListener(
                e -> gameStateObservable.setGameState(GameState.STARTED)
        );

        exitButton.setBounds(150, 220, 200, 50);
        exitButton.setVisible(false);
        exitButton.addActionListener(
                e -> System.exit(0)
        );

        sky.setBackground(Color.CYAN);

        ground.setBounds(0, 400, 500, 100);
        ground.setBackground(new Color(0x9a5c1d));

        grass.setBounds(0, 380, 500, 20);
        grass.setBackground(Color.GREEN);

        this.setBackground(Color.CYAN);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        addComponents();
    }

    private void addComponents() {
        this.add(score);
        this.add(title);
        this.add(playButton);
        this.add(exitButton);
        this.add(ground);
        this.add(grass);
        this.add(sky);
    }

    private void stateChanged() {
        playButton.setVisible(false);
        exitButton.setVisible(false);
        title.setVisible(false);
        score.setVisible(false);
    }

    private void setInitState() {
        title.setVisible(true);
        title.setText("Flappy Bird");

        playButton.setVisible(true);
        playButton.setText("Start");

        exitButton.setVisible(true);
        exitButton.setText("Exit");
    }

    private void setGameStartedstate() {
        mScore = 0;
    }

    private void setGameOverState() {
        title.setVisible(true);
        title.setText("Game Over!");

        score.setVisible(true);
        score.setText("Score = " + score);

        playButton.setVisible(true);
        playButton.setText("Start");

        exitButton.setVisible(true);
        exitButton.setText("Exit");
    }

    @Override
    public void onGameStateChanged(GameState gameState) {
        stateChanged();
        switch (gameState) {
            case INIT:
                setInitState();
                break;
            case STARTED:
                setGameStartedstate();
                break;
            case GAME_OVER:
                setGameOverState();
                break;
            default:
                break;
        }
    }
}
