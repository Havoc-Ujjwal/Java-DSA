import java.util.Scanner;

public class sqrt {

    public static long sqrtInteger(int n) {

        int s = 0;
        int e = n;
        long mid = s + (e - s) / 2;

        long ans = -1;
        while (s <= e) {

            long square = mid * mid;

            if (square == n)
                return mid;

            if (square < n) {
                ans = mid;
                s = (int) (mid + 1);
            } else {
                e = (int) (mid - 1);
            }
            mid = s + (e - s) / 2;
        }
        return ans;
    }

    public static double morePrecision(int n, int precision, int tempSol) {

        double factor = 1;
        double ans = tempSol;

        for (int i = 0; i < precision; i++) {
            factor = factor / 10;

            for (double j = ans; j * j < n; j = j + factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();

        int tempSol = (int)sqrtInteger(n);
        System.out.println("Answer is: " + morePrecision(n, 3, tempSol));

        scanner.close();
    }
}
