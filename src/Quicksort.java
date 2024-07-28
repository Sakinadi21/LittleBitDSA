public class Quicksort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot should be the last element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }



    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 3, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//This Java code implements the Quicksort algorithm to sort an array of integers. Here's a breakdown of the code:
//
//1. `partition`: This method takes an array `arr`, a `low` index, and a `high` index.
// It selects the pivot element as the element at the `high` index.
// It then rearranges the array such that all elements smaller than the pivot are placed to the left of the pivot, and all elements greater than the pivot are placed to the right of the pivot.
// It returns the index where the pivot element is finally placed.
//
//2. `quickSort`: This method performs the Quicksort algorithm recursively.
// It first calls the `partition` method to determine the pivot index (`pi`).
// Then, it recursively calls `quickSort` on the subarrays to the left and right of the pivot index until the entire array is sorted.
//
//3. `main`: In the `main` method, an array is initialized with some values.
// It then calls `quickSort` to sort the array in ascending order. Finally, it prints the sorted array.
//
//The Quicksort algorithm works by selecting a pivot element and partitioning the array around the pivot.
// Elements smaller than the pivot are moved to the left, and elements greater than the pivot are moved to the right.
// This process is repeated recursively on the subarrays until the entire array is sorted.
//
//Note: This code sorts the array in ascending order.
