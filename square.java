import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int num=jv.nextInt();
        System.out.println(perfect_sq(num));

    }

    public static int perfect_sq(int num) {
        long beg=0;
       long end=num;

        while(beg<=end){
            long mid=beg+(end-beg)/2;
            if(mid*mid==num){
                return (int)mid;
            }
            else if(mid*mid>num){
                end=mid-1;

            }
            else{
                beg=mid+1;

            }


        }
        return (int)end;

    }
}
