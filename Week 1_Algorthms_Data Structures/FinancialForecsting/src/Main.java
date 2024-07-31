import service.Forecasting;
import service.ForecastingOptimized;

public class Main {
    public static void main(String[] args) {
        Forecasting forecasting = new Forecasting();
        ForecastingOptimized optimizedForecasting = new ForecastingOptimized();

        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% annual growth
        int years = 10;

        // Using Recursive Approach
        double futureValueRecursive = forecasting.predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value (Recursive): $" + futureValueRecursive);

        // Using Iterative Approach
        double futureValueIterative = optimizedForecasting.predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value (Iterative): $" + futureValueIterative);
    }
}