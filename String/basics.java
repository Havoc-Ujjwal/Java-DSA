import java.util.*;
public class basics{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);

        String FirstName;
        System.out.print("Enter Your first name: ");
        FirstName = sc.nextLine();
        String LastName;
        System.out.print("Enter Your last name: ");
        LastName = sc.nextLine();

        String FullName = FirstName + " " + LastName;
        System.out.println("Your full name is : "+FullName);
        System.out.println("and Length is : " +FullName.length()); 
    }
}