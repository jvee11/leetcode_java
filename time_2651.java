import java.util.Scanner;

public class time_2651 {
    public static void main(String[] args) {
        Scanner jv = new Scanner(System.in);
        int arrival = jv.nextInt();
        int delayed = jv.nextInt();
        System.out.println(time(arrival,delayed));
    }


    public static int time(int arrival,int delayed) {

        int time=delayed+arrival;
        if(time<24){
            return time;


        }
        else{
            return time%24;

        }

    }
}
