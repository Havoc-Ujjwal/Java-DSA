public class reverseArray {
    public static void Solution(int num[]){
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;     
            
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int num[] = { 2, 4, 6, 8, 10, 12};

        Solution(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
