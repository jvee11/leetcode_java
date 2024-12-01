public class rotate_func396 {
    public static void main(String[] args) {
        int nums []={4,3,2,6};
        int k=3;
        int i=0;
        int j=0;
        rot_func(nums,i,j);

    }

    public static void rot_func(int arr[],int i,int j) {
        int sum=0;
        int k=3;
        rotation(arr,k);
        for ( i = 0; i < arr.length ; i++) {
            sum=sum+i*arr[i];
            System.out.println(sum);


        }

    }

    public static void rotation(int arr[],int k){
        int n = arr.length;
    k = k % n;
    // 1st n-k elements reverse krna h
    rev(arr, 0, n - k-1);
    //last k element reverse krna h
    rev(arr, n - k, n - 1);
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
}
