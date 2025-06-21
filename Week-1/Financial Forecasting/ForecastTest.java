public class ForecastTest {
    public static void main(String[] args) {
        double initial = 1000.0; // Initial investment
        double rate = 0.07;      // 7% annual growth
        int years = 10;

        double recursiveValue = FinancialForecast.forecastRecursive(years, rate, initial);
        double iterativeValue = FinancialForecast.forecastIterative(years, rate, initial);

        System.out.printf(" Recursive Forecast after %d years: ₹%.2f%n", years, recursiveValue);
        System.out.printf(" Iterative Forecast after %d years: ₹%.2f%n", years, iterativeValue);

        System.out.println("\n Time Complexity:");
        System.out.println("- Recursive: O(n) time, O(n) space (call stack)");
        System.out.println("- Iterative: O(n) time, O(1) space");
        System.out.println(" Iterative is more efficient for large values of n due to lower memory usage.");
    }
}
