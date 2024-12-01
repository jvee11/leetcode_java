public class shuffle_arr {
    public static void main(String[] args) {
        int []nums={2,5,1,3,4,7};
        int n=3;
        int shuff[]=new int[nums.length];
        shuffle(nums,n);


        }




    public static int[] shuffle(int[] nums, int n) {
        int shuff[]=new int[nums.length];
        for (int i = 0; i < n ; i++) {
            shuff[2*i]=nums[i];
            shuff[2*i+1]=nums[i+n];


        }

        return shuff;


    }
    }
