import java.util.*;
public class LinSearch {
    public static int linearSearch(String fruits[], String target){
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fruits[] = {"Banana", "Apple", "Guava", "Orange", "Grapes"};
        System.out.print("Enter fruit name those fruit you want to serch from array : ");
        String target = sc.nextLine();
        sc.close();

        int index = linearSearch(fruits, target);
        if (index == -1 ) {
            System.out.println("Fruits is not Available ! ");
        } else {
            System.out.println(target+ " at index of "+index);
        }
    }
}
