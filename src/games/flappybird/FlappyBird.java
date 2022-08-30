package games.flappybird;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlappyBird extends JFrame implements
        Observable.OnValueChangedListener<GameState>,
        Renderer.RendererRepaintListener,
        KeyListener
{

    private final GameController gameController = new GameController();
    private final Renderer renderer = new Renderer(this);
    private final GamePanel gamePanel = new GamePanel(gameController);
    private final JPanel sky = new JPanel();
    private final JPanel ground = new JPanel();
    private final JPanel grass = new JPanel();
    private final JButton playButton = new JButton();
    private final JButton exitButton = new JButton();
    private final JLabel title = new JLabel();
    private final JLabel score = new JLabel();



    public FlappyBird() {
        initScenario();

        gameController.gameState.observe(this);
        gameController.score.observe(value -> {
            if (gameController.gameState.getValue() != GameState.INIT) {
                score.setText("Score = " + value);
            }
        });
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
                e -> gameController.startGame()
        );

        exitButton.setBounds(150, 220, 200, 50);
        exitButton.setVisible(false);
        exitButton.addActionListener(
                e -> gameController.exit()
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
        this.setTitle("Flappy Bird");
        this.addKeyListener(this);
        this.setVisible(true);
        addComponents();
    }

    private void addComponents() {
        this.add(renderer);
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

    private void setGameStartedState() {
    }

    private void setGameOverState() {
        title.setVisible(true);
        title.setText("Game Over!");

        score.setVisible(true);

        playButton.setVisible(true);
        playButton.setText("Start");

        exitButton.setVisible(true);
        exitButton.setText("Exit");
    }

    @Override
    public void onValueChanged(GameState value) {
        stateChanged();
        switch (value) {
            case INIT:
                setInitState();
                break;
            case STARTED:
                setGameStartedState();
                break;
            case GAME_OVER:
                setGameOverState();
                break;
            default:
                break;
        }
    }

    @Override
    public void onRepaint(Graphics g) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_SPACE) {
            gameController.jump();
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}
}
