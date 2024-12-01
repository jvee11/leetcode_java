public class leet744 {
    public static void main(String[] args) {
        char letters[] = {'c', 'f', 'j'};
        int target = 'f';//ceiling no is the smallest element in array greater or equal to target
        System.out.println(letters[ceiling(letters, target)]);

    }

    public static char ceiling(char letters[], int target) {

        //but if the target is greater than last element and smaller than least element then return first index
        int beg = 0;
        int end = letters.length - 1;
        while (beg <= end) {
            //int mid = (beg + end) / 2; //might be possible that start+end exceeds the range of java
            int mid=beg+(end-beg)/2;


            if (letters[mid] > target) {
                end = mid - 1;

            } else {
                beg = mid + 1;
            }
        }
        return letters[beg%letters.length];//when the while loop breaks beg=end+1 , the next big number =beg


    }
}

