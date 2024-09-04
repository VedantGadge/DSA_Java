public class insertion_sort1 {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        // Insertion sort
        //time complexity = O(n^2)
        // Loop through the array starting from the second element
        for(int i = 0; i < arr.length; i++) {
            // Store the current element to be inserted into the sorted portion
            int current = arr[i];
            // Initialize j to the last index of the sorted portion (element before the current one)
            int j = i - 1;

            // Shift elements of the sorted portion that are greater than 'current' to the right
            while(j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j]; // Move element one position to the right
                j--; // Move left in the sorted portion
            }

            // Place the current element in its correct position within the sorted portion
            arr[j + 1] = current;
        }

        // Print the sorted array
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


// In selection sort, we basically make two parts of the array: sorted n unsorted,n we compare the element closest to the boundary in the unsorted part,
// n check with each element of the sorted part n place it at its rightful place 
