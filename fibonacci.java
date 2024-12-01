import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int n=jv.nextInt();
    }

    public static int fibo(int n) {
        int f0=0;
        int f1=1;
        if(n==0){
            return 0;
        }
            if(n==1){
                return 1;
            }
            return fibo(n-1)+fibo(n-2);

        }




    }
