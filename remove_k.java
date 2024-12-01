public class remove_k {
    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;


        System.out.println(remove(num,k));

    }

    public static char [] sorting(String num) {
        char[] arr = num.toCharArray();
        for (int i = 1; i < num.length(); i++) {//insertion sort

            int j;
            char item = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > item; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j+1] = item;

        }
        return arr;



    }

    public static String remove   (String num,int k) {
        char[] arr = sorting(num);
        String num1=new String(arr);
         return num1.substring(0,num1.length()-k);





    }
}





