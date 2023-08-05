package game;

public class Level3 extends State {
    public Level3(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int point) {
        int totalPoints = game.getTotalPoints();
        totalPoints +=3 * point;
        game.setTotalPoints(totalPoints);
        System.out.println(game);
    }
}
