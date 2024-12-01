public class subarray_total {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1};
        count_sub_arr(arr);

    }

    public static void count_sub_arr(int arr[]) {
        for (int i = 0; i <arr.length ; i++) {//for starting
            for (int j = i; j < arr.length ; j++) {//for ending point
                for (int k = i; k < j; k++) {//for subarray
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();

            }


        }



    }
}
