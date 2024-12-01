import java.util.Scanner;

public class pivot_int {
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int n=jv.nextInt();
        System.out.println(pivot(n));

    }

    public static int pivot(int n) {
        int leftsum =0;

        int total_sum =n*(n+1)/2;


        for (int i = 1; i <=n;i++) {
            leftsum = leftsum +i;
            int right_sum=total_sum-(leftsum+i);




            if(leftsum ==right_sum){
                return i;
            }



        }
        return -1;



    }
}
