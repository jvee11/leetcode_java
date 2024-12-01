public class special {
    public static void main(String[] args) {
        int arr[]={0,4,3,0,4};
        System.out.println(special_arr(arr));


    }

    public static int special_arr(int nums[]) {
        int x=0;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(x<=nums[i]&&count==x){
                count++;
                return count;

            }
            return x;

        }
        return -1;

    }
}
