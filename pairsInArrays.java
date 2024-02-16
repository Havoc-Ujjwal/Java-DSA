public class pairsInArrays {
    public static void solution(int arr[]){
        int TotalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i+1 ; j < arr.length; j++) {
                System.out.print("("+curr+","+arr[j]+")");
                TotalPairs +=1;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+TotalPairs);
    }
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};

        solution(arr);
    }
}
