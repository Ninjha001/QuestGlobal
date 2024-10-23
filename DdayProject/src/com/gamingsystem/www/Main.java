package com.gamingsystem.www;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ScoreCalculator score = new ScoreCalculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the type of game: ");
		String gameType = scanner.nextLine();
		System.out.println("enter the level of difficulty(hard/medium/easy): ");
		String gameDifficulty = scanner.nextLine();
		System.out.println("enter the player performance: ");
		double playerPerformance = scanner.nextDouble();
		System.out.println("enter the number of power ups used: ");
		int powerUpsUsed = scanner.nextInt();
		System.out.println();
		System.out.println("DETAILS");
		System.out.println("-------");
		System.out.println("Game Type: " + gameType);
		System.out.println("Difficulty Level: " + gameDifficulty);
		System.out.println("Player Performance: " + playerPerformance);
		System.out.println("PowerUps used: " + powerUpsUsed);
		System.out.println("Total Score: " + score.calculateScore(gameType, gameDifficulty, playerPerformance, powerUpsUsed));
		scanner.close();
	}

}
