public class contains_duplicate {
    public static void main(String[] args) {
        int nums[]={3,1};
        boolean s=sort(nums);
        System.out.println(s);
    }

    public static boolean sort(int nums[]) {
        int item,j;
        for (int i = 1; i < nums.length ; i++) {
            item=nums[i];
            for (j = i-1; j >=0&&nums[j]>item; j--) {
                nums[j+1]=nums[j];


            }
            nums[j+1]=item;

        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]==nums[i]){
                return true;
            }
            return false;

        }
        return false;




    }
}
