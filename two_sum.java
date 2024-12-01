public class two_sum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        int result[]=twoSum(nums,target);
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]+" ");

        }


    }
    public static  void twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//
//
//            }
//
//
//        }
//        return null;
//    }
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]<target){
                left++;
            } else if (nums[left]+nums[right]>target) {
                right--;
            }
           

            }
        }


    }

