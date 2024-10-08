public class MinMaxCalculation {
    public static double max(double[] nums) {
        double maxNum = Integer.MIN_VALUE;
        if (nums.length == 0 || nums == null) {
            return maxNum;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static double min(double[] nums) {
        double minNum = Integer.MAX_VALUE;
        if (nums.length == 0 || nums == null) {
            return minNum;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        return minNum;
    }
}
