import java.util.*;
public class Solution1 {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
                count++;
            }
        }
        System.out.println(count);

    }    
}
