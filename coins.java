import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int n=jv.nextInt();
        int row=1;
        int count=0;
        while(n-row>=0){
            n=n-row;
           row++;
           count++;


        }
        System.out.println(count);

    }
}
