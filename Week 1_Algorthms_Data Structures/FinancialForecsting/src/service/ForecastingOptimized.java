package service;

public class ForecastingOptimized {
    public double predictFutureValue(double initialValue, double growthRate, int years) {
        double futureValue = initialValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
