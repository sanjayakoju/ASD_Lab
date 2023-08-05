package game;


public class Game {
	private int totalPoints = 0;
	private State level;

	void setState(State level){
		this.level = level;
	}

	void addPoints(int newPoints){
		level.addPoint(newPoints);
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints){
		this.totalPoints = totalPoints;
	}

	@Override
	public String toString() {
		return "Game{" +
				"totalPoints=" + totalPoints +
				", level=" + level +
				'}';
	}

}
