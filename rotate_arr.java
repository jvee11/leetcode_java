import java.util.Scanner;

public class rotate_arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void rotate(int arr[], int k) {
        int i = 0;
        int j = arr.length - k;
        while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;


            }
        }
            }



