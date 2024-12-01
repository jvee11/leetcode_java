public class Monotonic_Array {
    public static void main(String[] args) {
        int[] input = {7,8,2,1};
        System.out.println(isMonotonic(input)); // true
    }

    public static boolean isMonotonic(int[] array) {
        return isIncreasing(array) || isDecreasing(array);
    }

    public static boolean isIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        return true;
    }

    public static boolean isDecreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] < nums[i]) {
                return false;
            }
        return true;
    }

}
