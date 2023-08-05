package game;

public class Level2 extends State {
    public Level2(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int point) {
        int totalPoints = game.getTotalPoints();
        totalPoints += 2 * point;
        if (totalPoints > 15) {
            totalPoints += 1;
            game.setState(new Level2_5(game));
            game.setTotalPoints(totalPoints);
        } else if (totalPoints > 10) {
            totalPoints += 2;
            game.setState(new Level3(game));
            game.setTotalPoints(totalPoints);
        }
        System.out.println(game);
    }
}
