public class insertion_sort1 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //insertion sort
        for(int i = 0;i<arr.length;i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+i] = current;
        }


        // In selection sort, we basically make two parts of the array: sorted n unsorted,n we compare the element closest to the boundary in the unsorted part,
        // n check with each element of the sorted part n place it at its rightful place. 

        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
