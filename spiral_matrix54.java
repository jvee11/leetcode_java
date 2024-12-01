public class spiral_matrix54 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        spiral(arr);


    }

    public static void spiral(int arr[][]) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int tele = arr.length * arr[0].length;//4*3 matrix
        int c = 0;
        while (c < tele) {
            for (int i = minc; i <= maxc && c<tele; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;

            }
            minr++;
            for (int i = minr; i <= maxr && c<tele; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;

            }
            maxc--;
            for (int i = maxc; i >= minc && c<tele; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;


            }
            maxr--;
            for (int i = maxr; i >= minr && c<tele; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;

            }
            minc++;


        }
    }
}
