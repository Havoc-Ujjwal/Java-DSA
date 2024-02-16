public class maxSubArraySum{
    public static void BruteForce(int numbers[]){
        int CurrentSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start =  i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                CurrentSum = 0;
                for (int k = start; k <= end; k++) {
                    CurrentSum += numbers[k];
                }
                System.out.println(CurrentSum);
                if (CurrentSum > MaxSum) {
                    MaxSum = CurrentSum;
                }
            }
        }
        System.out.println("Max Sum is = "+MaxSum);
    }
    public static void PrefixSum(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i]; 
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; 
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void Kadans(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max sum of subarray is : "+ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};

        Kadans(numbers);
    }
}