public class harshad_no {
    public static void main(String[] args) {
        int x=18;
        System.out.println(sumOfTheDigitsOfHarshadNumber(x));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int ori_x=x;
        while(x>0){
            sum=sum+x%10;
            x=x/10;


        }
        if(sum%x==0){
            return sum;




        }
        return -1;
    }

    }



