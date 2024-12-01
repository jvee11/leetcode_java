public class transpose_867 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }



    }

    public static int[][] transpose(int arr[][]) {
        int a[][]=new int[arr[0].length][arr.length];// this is new array for transpose with
                                                     // rows and coloumns interchangingh
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                a[j][i] = arr[i][j];


            }
        }



        return a;

    }

}

