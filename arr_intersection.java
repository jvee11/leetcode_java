public class arr_intersection {
    public static void main(String[] args) {
        int num1[]={1,2,2,1};
        int num2[]={2,2};

    }

    public static int[] intersection(int nums1[],int nums2[]) {
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    return new int []{i,j};
                }

            }

        }
        return nums1;


    }
}
