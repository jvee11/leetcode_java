public class good_pairs {
    public static void main(String[] args) {
        int []nums = {1, 2, 3, 1, 1, 3};
    }

    public static int numIdenticalPairs(int[] nums) {
      int i=0;
      int j=nums.length;
      int pair=0;
      while(i<j){
          if(nums[i]==nums[j]){
              System.out.print(i);
              System.out.println(j);


          }
          else {
              i++;
              j--;

          }

        }
      return i;

    }
}
