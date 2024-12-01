public class mountain_arr {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,2,1};
        if (arr.length >= 3) {
            System.out.println(moun_1(arr) && moun_dec(arr));


        }
        else {
            System.out.println("false");
        }
    }

    public static boolean moun_1(int arr[]) {

            for (int i = 0; i < (arr.length - 1) / 2; i++) {
                if (arr[i] >= arr[i + 1]) {
                    return false;

                }
            }
            return true;


    }


    public static boolean moun_dec(int arr[]) {


            for (int i = (arr.length)/2; i < arr.length-1 ; i++) {


                    if (arr[i] <= arr[i + 1]) {
                        return false;

                    }


                }
                return true;
            }


    }
