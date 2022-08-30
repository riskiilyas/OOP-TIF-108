package games.flappybird;

public class GameStateObservable {

    private GameState gameState;
    private OnGameStateChangedListener subscriber;

    GameStateObservable(GameState gameState) {
        this.gameState = gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
        subscriber.onGameStateChanged(this.gameState);
    }

    public void observe(OnGameStateChangedListener listener) {
        subscriber = listener;
        subscriber.onGameStateChanged(gameState);
    }

    interface OnGameStateChangedListener {
        void onGameStateChanged(GameState gameState);
    }

}
