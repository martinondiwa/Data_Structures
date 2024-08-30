public class Bigolog {
    // This method calculates the number of times you can double 1 before reaching n
    public int bigolog(int n) {
        int count = 0;
        for (int i = 1; i < n; i = i * 2) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Bigolog logCalculator = new Bigolog();
        int result = logCalculator.bigolog(16); // Example usage with n = 16
        System.out.println("Count: " + result);
    }
}