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
    /**
     * @author: Ishita
     *          Compute the min of an array of numbers.
     */
    public static double min(double... numbers) {
        double min = Double.POSITIVE_INFINITY;
        for (double num : numbers) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
}
