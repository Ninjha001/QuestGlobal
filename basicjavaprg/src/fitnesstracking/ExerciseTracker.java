package fitnesstracking;

public class ExerciseTracker {
    public static double calculateCaloriesBurned(int duration, String intensity) {
        double caloriesPerMinute = getCaloriesPerMinute(intensity);
        return duration * caloriesPerMinute;
    }

    public static double calculateCaloriesBurned(int duration, String intensity, double weight) {
        double caloriesPerMinute = getCaloriesPerMinute(intensity, weight);
        return duration * caloriesPerMinute;
    }

    public static double calculateCaloriesBurned(int duration, String intensity, double weight, String exerciseType) {
        Exercise exercise = getExerciseInstance(exerciseType);
        double caloriesPerMinute = exercise.getCaloriesPerMinute(intensity, weight);
        return duration * caloriesPerMinute;
    }

    private static double getCaloriesPerMinute(String intensity) {
        return getCaloriesPerMinute(intensity, 0.0);
    }

    private static double getCaloriesPerMinute(String intensity, double weight) {
        Exercise exercise = getExerciseInstance("Running");
        return exercise.getCaloriesPerMinute(intensity, weight);
    }

    private static Exercise getExerciseInstance(String exerciseType) {
        if (exerciseType.equalsIgnoreCase("Running")) {
            return new Running();
        } else if (exerciseType.equalsIgnoreCase("Cycling")) {
            return new Cycling();
        } else if (exerciseType.equalsIgnoreCase("Swimming")) {
            return new Swimming();
        } else {
            throw new IllegalArgumentException("Invalid exercise type");
        }
    }
}
