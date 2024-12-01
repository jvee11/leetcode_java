import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum_3 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        threeSum(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");

        }

    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>>result=new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j <nums.length; j++) {
                for (int k = j; k < nums.length ; k++) {
                    if (nums[i] + nums[j] + nums[k]==0) {
                        result.add(Arrays.asList());

                        }

                }

            }
            
        }
        return null;

    }
}
