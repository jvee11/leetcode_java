public class richest_customer {
    public static void main(String[] args) {
        int accounts[][] = {{1,5}, {7, 3}, {3,5}};
        System.out.println(maximumWealth(accounts));


    }

    public static int maximumWealth(int[][] accounts) {

        int i = 0;
        int max_wealth[]=new int[accounts.length];


        while (i < accounts.length) {
            int j = 0;

            while (j < accounts[0].length) {
                max_wealth[i] = max_wealth[i] + accounts[i][j];
                j++;


            }
            System.out.println(max_wealth[i]+" ");
            i++;


        }
        int max=max_wealth[0];


        for (int k = 0; k <max_wealth.length ; k++) {

            if(max_wealth[k]>max){
                max=max_wealth[k];

            }

        }
        return max;



    }
}






