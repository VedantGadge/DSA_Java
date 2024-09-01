class selection_sort1 {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //
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
        // 
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

//https://youtube.com/shorts/ya176hFz_f8?si=8DY2HqD55WvNZWk7
