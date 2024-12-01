import java.util.Scanner;

public class leet1716 {
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int n= jv.nextInt();
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum=sum+n%7;
            
        }
        System.out.println(sum);
    }
}
