public class MinMaxCalculation {
    /**
     * @author: Mattis
     *          Compute the max of an array of numbers.
     */
    public static double max(double... numbers) {
        double max = Double.NEGATIVE_INFINITY;
        for (double num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
