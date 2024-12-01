public class search81 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int element=6;
        System.out.println(linear_search1(arr,element));


        }



    public static void rot(int arr[], int k) {

        int n = arr.length;
        k = k % n;
        // 1st n-k elements reverse krna h
        rev(arr, 0, n - k-2);
        //last k element reverse krna h
        rev(arr, n - k-1, n - 1);
        //all elements reverse krna h
        rev(arr, 0, n - 1);


    }

    public static void rev(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }




    public static boolean linear_search1(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;


            }
        }


        return false;

    }
}
