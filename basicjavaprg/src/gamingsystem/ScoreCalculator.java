package gamingsystem;

public class ScoreCalculator {
	public int[] calculateScore(String gameType, String gameDifficulty) {
		Game game = getGame(gameType);
		int baseScore = (int) game.getBaseScore();
		int finalScore = 0;
		if(gameDifficulty.equalsIgnoreCase("Hard")) {
			finalScore = baseScore + 20;
		}else if(gameDifficulty.equalsIgnoreCase("Medium")) {
			finalScore = baseScore + 10;
		}else if(gameDifficulty.equalsIgnoreCase("Easy")) {
			finalScore = baseScore + 0;
		}
		return new int[] {finalScore,0,0,finalScore};
	}
	
	public int[] calculateScore(String gameType, String gameDifficulty, double playerPerformance) {
		int[] baseScoreData = calculateScore(gameType, gameDifficulty);
		int baseScore = baseScoreData[0];
		int performanceBonus = (int)(playerPerformance * 50);
		int finalScore = baseScore + performanceBonus;
		return new int[] {baseScore,performanceBonus,0,finalScore};
	}
	
	public int[] calculateScore(String gameType, String gameDifficulty, double playerPerformance, int powerUpsUsed) {
		int[] baseScoreData = calculateScore(gameType, gameDifficulty);
		int baseScore = baseScoreData[0];
		int performanceBonus = (int)(playerPerformance * 50);
		int powerUpBonus = powerUpsUsed * 100;
		int finalScore = baseScore + performanceBonus + powerUpBonus;
		return new int[] {baseScore,performanceBonus,powerUpBonus,finalScore};
		
	}
	
	private Game getGame(String gameType) {
		switch(gameType.toLowerCase()) {
		case "arcade":
			return new ArcadeGame();
		case "puzzle":
			return new PuzzleGame();
		case "strategy":
			return new StrategyGame();
		default:
			throw new IllegalArgumentException("Invalid game type.");
		}
	} 
}
