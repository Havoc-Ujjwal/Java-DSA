public class largeAndSmallest {
    public static int getLargest(int num[]){
        int larger = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (larger < num[i]) {
                larger = num[i];
            }
        }
        return larger;
    }
    public static int getSmallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int num[] = {1, 6, 3, 5, 2 };

        System.out.println("Largest num from araay is : "+getLargest(num));
        System.out.println("Smallest num from araay is : "+getSmallest(num));
    }
}
