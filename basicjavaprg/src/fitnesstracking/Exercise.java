package fitnesstracking;

abstract class Exercise {
    public abstract double getCaloriesPerMinute(String intensity, double weight);
}

class Running extends Exercise {
    @Override
    public double getCaloriesPerMinute(String intensity, double weight) {
        double baseCalories = 10.0;
        double intensityFactor = getIntensityFactor(intensity);
        double weightFactor = getWeightFactor(weight);
        return baseCalories * intensityFactor * weightFactor;
    }

    private double getIntensityFactor(String intensity) {
        if (intensity.equalsIgnoreCase("low")) {
            return 1.0;
        } else if (intensity.equalsIgnoreCase("medium")) {
            return 1.5;
        } else if (intensity.equalsIgnoreCase("high")) {
            return 2.0;
        } else {
            throw new IllegalArgumentException("Invalid intensity level");
        }
    }

    private double getWeightFactor(double weight) {
        return 1.0 + (weight - 70.0) / 10.0;
    }
}

class Cycling extends Exercise {
    @Override
    public double getCaloriesPerMinute(String intensity, double weight) {
        double baseCalories = 5.0;
        double intensityFactor = getIntensityFactor(intensity);
        double weightFactor = getWeightFactor(weight);
        return baseCalories * intensityFactor * weightFactor;
    }

    private double getIntensityFactor(String intensity) {
        if (intensity.equalsIgnoreCase("low")) {
            return 1.0;
        } else if (intensity.equalsIgnoreCase("medium")) {
            return 1.3;
        } else if (intensity.equalsIgnoreCase("high")) {
            return 1.6;
        } else {
            throw new IllegalArgumentException("Invalid intensity level");
        }
    }

    private double getWeightFactor(double weight) {
        return 1.0 + (weight - 70.0) / 20.0;
    }
}

class Swimming extends Exercise {
    @Override
    public double getCaloriesPerMinute(String intensity, double weight) {
        double baseCalories = 8.0;
        double intensityFactor = getIntensityFactor(intensity);
        double weightFactor = getWeightFactor(weight);
        return baseCalories * intensityFactor * weightFactor;
    }

    private double getIntensityFactor(String intensity) {
        if (intensity.equalsIgnoreCase("low")) {
            return 1.0;
        } else if (intensity.equalsIgnoreCase("medium")) {
            return 1.4;
        } else if (intensity.equalsIgnoreCase("high")) {
            return 1.8;
        } else {
            throw new IllegalArgumentException("Invalid intensity level");
        }
    }

    private double getWeightFactor(double weight) {
        return 1.0 + (weight - 70.0) / 15.0;
    }
}