class selection_sort1 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //time complexity = O(n^2)
        //selection sort
        for (int i = 0;i<arr.length;i++)
        {
            int smallest = i;
            for (int j = i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // In selection sort the we find the smallest element in each loop , n swap n place it at the first position.
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

//https://youtube.com/shorts/ya176hFz_f8?si=8DY2HqD55WvNZWk7
