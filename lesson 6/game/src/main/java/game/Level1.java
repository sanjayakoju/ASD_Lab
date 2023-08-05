package game;

public class Level1 extends State {

    public Level1(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int point) {
        int totalPoints = game.getTotalPoints();
        totalPoints += point;
        if (totalPoints > 10) {
            totalPoints += 1;
            game.setState(new Level2(game));
            game.setTotalPoints(totalPoints);
        }
        System.out.println(game);
    }
}
