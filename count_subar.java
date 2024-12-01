public class count_subar {
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 3, 3};
        int k = 2;



    }

    public static int max_element(int nums[], int k) {

        int i = 0;
        int max = nums[i];
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return max;
    }


    public static void count_subarr(int nums[], int k) {
        int max = max_element(nums, k);
        int count = 0;


        int l = 0;
        int max_count = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == max) {
                max_count++;
            }

        }
        while (max_count == k) {
        }
    }
}
