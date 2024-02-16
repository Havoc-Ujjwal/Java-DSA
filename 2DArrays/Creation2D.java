import java.util.*;
public class Creation2D {

    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j] == key){
                    System.out.println("Found at cell"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found !");
        return false;
    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;  //for calculating no of row in 2D arrays
        int m = matrix[0].length;  // for calculating no of columns in arrays
        Scanner sc = new Scanner(System.in);

        // For input of 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        // For Output of 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);

    }
}
