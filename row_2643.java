
public class row_2643 {
    public static void main(String[] args) {
        int mat[][] = {{0, 0}, {1, 1}, {1, 0}};
        int arr[]=    count(mat);

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }


    }

    public static int[] count(int mat[][]) {
        int max_count = 0;
        int row=0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }

                if (count>max_count){//for present row
                    max_count=count;
                    row=i;

                }
            }



        }
        int arr[]={row,max_count};
        return arr;
    }
}






