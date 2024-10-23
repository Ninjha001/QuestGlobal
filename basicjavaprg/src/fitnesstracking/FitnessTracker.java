package fitnesstracking;

import java.util.Scanner;

public class FitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exercise duration (minutes): ");
        int duration = scanner.nextInt();

        System.out.print("Enter intensity level (low, medium, high): ");
        String intensity = scanner.next();

        System.out.print("Enter user's weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter exercise type (Running, Cycling, Swimming): ");
        String exerciseType = scanner.next();

        double caloriesBurned;

        if (weight > 0) {
            caloriesBurned = ExerciseTracker.calculateCaloriesBurned(duration, intensity, weight, exerciseType);
        } else {
            caloriesBurned = ExerciseTracker.calculateCaloriesBurned(duration, intensity);
        }

        System.out.println("\nExercise Summary:");
        System.out.println("Type: " + exerciseType);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Intensity: " + intensity);
        System.out.println("Weight: " + weight + " kg");
        System.out.printf("Total Calories Burned: %.2f\n", caloriesBurned);
    }
    
}
