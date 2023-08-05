package game;

public class Level2_5 extends State {
    public Level2_5(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int point) {
        int totalPoints = game.getTotalPoints();
        totalPoints += point;
        if (totalPoints > 20) {
            totalPoints += 1;
        }
        game.setState(new Level3(game));
        game.setTotalPoints(totalPoints);
        System.out.println(game);
    }
}
