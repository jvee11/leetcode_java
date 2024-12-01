public class rev_subarr {
    public static void main(String[] args) {
        int []target = {1,2,3,4};
        int arr[] = {2,4,1,3};
        System.out.println(canBeEqual(target,arr));

    }



    public static boolean canBeEqual(int[] target, int[] arr) {
        sort(target);
        sort(arr);
        for (int i = 0; i <target.length ; i++) {
            if(target[i]==arr[i]){
                return true;
            }


        }
        return false;


    }

    public static void sort(int[] arr2) {//insertion sort
        int j,item;


        for (int i = 0; i <arr2.length ; i++) {//for passes
            item=arr2[i];

            for (j = i-1; j >=0 && arr2[j]>item  ; j--) {//comparison in passes
                arr2[j+1]=arr2[j];

            }
            arr2[j+1]=item;


        }


    }
}
