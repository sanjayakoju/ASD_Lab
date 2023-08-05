package game;

public abstract class State {

    Game game;

    public State(Game game) {
        this.game = game;
    }

    public abstract void addPoint(int point);
}
