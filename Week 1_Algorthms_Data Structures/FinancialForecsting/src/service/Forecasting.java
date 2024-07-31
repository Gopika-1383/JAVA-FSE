package service;

public class Forecasting {
    public double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: no years left to forecast
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: calculate future value based on the growth rate
        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

}
