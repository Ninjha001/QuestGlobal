package com.gamingsystem.www;

public class ScoreCalculator {
	public double calculateScore(String gameType, String gameDifficulty) {
		Game game = findGame(gameType);
		double difficulty = findGameDifficulty(gameDifficulty);
		double baseScore = game.getBaseScore();
		System.out.println("BaseScore: "+ baseScore);
		System.out.println("Difficulty score: "+difficulty);
		return baseScore + difficulty;
		
	}
	
	public double calculateScore(String gameType, String gameDifficulty, double playerPerformance) {
		double baseScore = calculateScore(gameType, gameDifficulty);
		double performanceBonus = playerPerformance * 50;
		System.out.println("Performance Bonus: " + performanceBonus);
		return baseScore + performanceBonus;
	}
	
	public double calculateScore(String gameType, String gameDifficulty, double playerPerformance, int powerUpsUsed) {
		double baseScore = calculateScore(gameType, gameDifficulty, playerPerformance);;
		double powerUpsBonus = powerUpsUsed * 10;
		System.out.println("Power Up Bonus: " + powerUpsBonus);
		return baseScore + powerUpsBonus;
	}
	
	private Game findGame(String gameType) {
		if(gameType.equalsIgnoreCase("arcade"))
			return new Arcade();
		else if(gameType.equalsIgnoreCase("puzzle"))
			return new Puzzle();
		else if(gameType.equalsIgnoreCase("strategy"))
			return new Strategy();
		else {
			System.out.println("Invalid game type. Defaulting to Arcade.");
			return new Arcade();
		}	
	}
	
	private double findGameDifficulty(String gameDifficulty) {
		if(gameDifficulty.equalsIgnoreCase("hard"))
			return 100;
		else if(gameDifficulty.equalsIgnoreCase("medium"))
			return 50;
		else if(gameDifficulty.equalsIgnoreCase("easy"))
			return 25;
		else
			return 0;
	}
	
}
