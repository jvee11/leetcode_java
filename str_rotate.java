public class str_rotate {
    public static void main(String[] args) {
        String s="abcde";
         String goal="cdeab";



    }

    public static String rotateString(String s, String goal) {
        int i=0;
        int j=s.length()-1;
        char []arr=s.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;



        }
        s=new String(arr);
        return s;




    }
}
