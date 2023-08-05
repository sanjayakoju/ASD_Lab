package game;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		Level1 level1 = new Level1(game);
		game.setState(level1);
		game.addPoints(1);
		game.addPoints(12);
		game.addPoints(17);
		game.addPoints(6);
	}

}
