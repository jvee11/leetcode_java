public class tickets {
    public static void main(String[] args) {
        int[] tickets = {2, 3, 2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets,k));


    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int sec=0;
        while(tickets[k]>0){
            for (int i = 0; i < tickets.length; i++) {
                if(tickets[i]>0){
                    tickets[i]=tickets[i]-1;
                    sec++;
                }
                if(i==k&&tickets[i]==0){
                    return sec;
                }

                }

                }
        return sec;



                }

}
