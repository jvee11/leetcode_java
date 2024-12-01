public class sort_colors {//needs rev again
    public static void main(String[] args) {
        int nums[]={2,1,0,1,0,2};
        sort(nums);
    }

    public static void sort(int nums[]) {
        int k=0;
        int i=0;//for 0 track
        int j= nums.length-1;//2 ka track
        while(k<=j){
            if(nums[k]==2){
            int temp=nums[k];
            nums[k]=nums[j];
            nums[j]=temp;
            k++;
            j--;
        }
        else if (nums[k]==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[j]=temp;
                k++;
                i--;
            }
        else{
            

            }

            }

    }

}
