public class buyandSellStocks {
    public static int solution(int price[]){
        int minSoFar = price[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, price[i]);
            int profit = price[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[] = {3, 1, 4, 8, 7, 2, 5};

        System.out.println("Maximun Profit : "+solution(price));

    }
}
