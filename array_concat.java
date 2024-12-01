public class array_concat {
    public static void main(String[] args) {
        int arr[]={1,3,2};
        int ans[]=new int[2* arr.length];
        arr_conncat(arr,ans);


    }

    public static void arr_conncat(int arr[],int ans[]) {
        for (int i = 0; i < arr.length ; i++) {
            ans[i]=arr[i];
            ans[i+ arr.length]=arr[i];

        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ,");

        }


    }

}
