public class lex_str {
    public static void main(String[] args) {
        String s = "45320";
        String n=getSmallestString(s);
        System.out.println(n);
    }
    public static String getSmallestString(String s) {
        char[]ch=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if(parity_compare(ch[i],ch[i+1])&& ch[i]>ch[i+1]){
                ch[i]=(char)(ch[i]^ch[i+1]);
                ch[i+1]=(char)(ch[i]^ch[i+1]);
                ch[i]=(char)(ch[i]^ch[i+1]);
                break;

            }

        }
        return new String(ch);
    }

    public static boolean parity_compare(int a, int b) {
        return (a-'0')%2==(b-'0')%2;

    }
}
