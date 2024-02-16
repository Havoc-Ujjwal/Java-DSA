// import java.util.Arrays;
public class basicSort {
    public static void bubbleSort(Integer arr[]){
        int n = arr.length;
        boolean swapped;
        for (int turn = 0; turn < n - 1; turn++) {
            swapped = false;
            for (int j = 0; j <  n - 1 - turn; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSort(Integer arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void insertionSort(Integer arr[]){
        for (int i = 1; i <  arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            // while (previous >= 0 && arr[previous] < current) { // decending sort if replace with below line 
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int arr[] = {4, 1, 3, 2, 0};

        countingSort(arr);
        printArray(arr);
    }
}
