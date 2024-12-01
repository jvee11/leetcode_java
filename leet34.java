import java.util.Arrays;

public class leet34 {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int beg = 0;
        int end = nums.length - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;

            if (nums[mid] > target) {
                end = mid - 1;

            } else if(nums[mid]<target) {
                beg = mid + 1;
            }

            else{
               //potential answer found
                int i=mid;
                int j=mid;
                while(i>=0&& nums[i]==target) {

                    i--;

                }
                while(j<nums.length && nums[j]==target) {

                    j++;

                }
                arr[0]=i+1; //after the loop, i points to the index before the actual starting position of the target.
                            // By adding 1 to i, you get the correct starting position
                arr[1]=j-1; //similarly for j
                return arr;




                }




            }

        return arr;


    }


}
