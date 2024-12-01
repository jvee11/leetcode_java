import java.util.Scanner;

public class leet_69 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int x = jv.nextInt();
        int ans=sqrt(x);
        System.out.println(ans);

}

    public static int sqrt(int x) {
        int beg = 0;

        int end = x;
        int ans=0;
        while (beg<=end) {

            //int mid = (beg + end) / 2; //might be possible that start+end exceeds the range of java
            int mid=beg+(end-beg)/2;
            if(mid*mid==x){
                ans=mid;
                ;
            }
            else if(mid*mid>x){
                end=mid-1;
            }
            else {
                beg=mid+1;

            }
        }
        return -1;

    }

    }
