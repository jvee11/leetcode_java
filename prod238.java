public class prod238 {
    public static void main(String[] args) {
        int arr[]={5,4,3,2};
        int num[]=product_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(num[i]+" ");

        }


    }

    public static int [] product_array(int[] nums) {
        int left[]=new int[nums.length];
        left[0]=1;
        for (int i = 1; i < left.length ; i++) {
            left[i]=left[i-1]* nums[i-1];
        }
        int right[]=new int[nums.length];
        right[nums.length-1]=1;
        for (int i = nums.length-2; i >=0 ; i--) {
            right[i]=right[i+1]* nums[i+1];

        }
        int answer[]=new int[nums.length];
        for (int i = 0 ;i< left.length; i++) {
            answer[i]=left[i]*right[i];

        }
        return answer;







    }
}
