
import java.util.Arrays;
public class Solution4 {
    public static void main(String s[]){
        String str1 = "earth";
        String str2 = "heaat";

        str1.toLowerCase();
        str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1Array = str1.toCharArray(); 
            char[] str2Array = str2.toCharArray();
            
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);

            if (result) {
                System.out.println("Given String "+str1 +" and "+str2 +" is anagram of each other ");
            } else {
                System.out.println("Given String "+str1 +" and "+str2 +" is not anagram of each other ");
            }
        } else{
            System.out.println("Given String "+str1 +" and "+str2 +" is not anagram of each other ");

        }
    }    
}
