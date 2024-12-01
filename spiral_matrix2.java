public class spiral_matrix2 {
    public static void main(String[] args) {
        int n=3;
    }
    public static int[][] generateMatrix(int n) {
        int arr[][]= new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(i==0){
                    arr[i][j]=j;

                }
                if(j==2){
                    arr[i][j]=i;
                }


            }

        }
        return arr;
    }
}
