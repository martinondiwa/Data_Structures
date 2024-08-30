public class Exponential {
    
    // This method calculates how many integers squared are less than n
    public int innerExponential(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            // Uncomment the next line if you want to see the values of i
            // System.out.println(i);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Exponential exponentialCalculator = new Exponential();
        int result = exponentialCalculator.innerExponential(16); // Example usage with n = 16
        System.out.println("Count: " + result);
    }
}