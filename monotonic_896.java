public class monotonic_896 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};
        System.out.println(mono_inc(arr) || mono_dec(arr));


    }

    public static boolean mono_inc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;

            }
        }

        return true;
    }


    public static boolean mono_dec(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;

            }



        }
        return true;
    }
}


