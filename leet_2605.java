public class leet_2605 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        int min = 0;


    }

    public static int smallest_no(int[] nums, int min) {
        int i = 0;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                return min;


            }
        }
        return i;
    }

    public static void nums(int[] nums, int min) {
        smallest_no(nums, min);


    }
}





