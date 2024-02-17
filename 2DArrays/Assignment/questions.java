public class questions {

    public static void solution1(int arr[][]){
        int countOf7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println(countOf7);
    }

    public static void solution2(int arr[][]){
        int sum = 0;

        // sum of 2nd row elements
        for (int j = 0; j < arr[0].length; j++) {
            sum+= arr[1][j];
        }
        System.out.println("Sum of 2nd row is : "+sum);
    }

    public static void solultion3(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;

        int transposeArr[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeArr[j][i] = arr[i][j];
            }
        }
        System.out.println("Here is Transposed matrix");
        printArray(transposeArr);
    }


    public static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }

    public static void main(String s[]){
        int arr[][] = {{2, 3, 7},
                       {5, 6, 7}};

        System.out.println("Here is Original matrix");
        printArray(arr);
        solultion3(arr);
    }    
}
