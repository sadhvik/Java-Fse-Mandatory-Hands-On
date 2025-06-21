public class FinancialForecast {


    public static double forecastRecursive(int years, double rate, double initialAmount) {
        if (years == 0) {
            return initialAmount;
        }
        return forecastRecursive(years - 1, rate, initialAmount) * (1 + rate);
    }


    public static double forecastIterative(int years, double rate, double initialAmount) {
        double value = initialAmount;
        for (int i = 1; i <= years; i++) {
            value *= (1 + rate);
        }
        return value;
    }
}
