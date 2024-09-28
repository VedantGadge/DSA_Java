public class merge_sort1 {

    //total time complexity is conquer x divide as they happen simultaneously , 
    //thus time complexity of merge sort = O(nlogn).

    public static void conquer(int arr[], int s,int mid, int e){

        //conquer takes O(n)
        int merged[] = new int[e-s+1];
        int index1 = s;
        int index2 = mid+1;
        int x = 0;

        while(index1<=mid && index2<=e){
            if(arr[index1]<=arr[index2]){
                merged[x] = arr[index1];
                x++; index1++;
            }
            else{
                merged[x] = arr[index2];
                x++; index2++;
            }
        }

        while(index1<=mid){
            merged[x] = arr[index1];
            x++; index1++;
        }

        while(index2<=e){
            merged[x] = arr[index2];
            x++; index2++;
        }

        for(int i = 0, j=s;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }


    public static void divide(int arr[], int s, int e){
         //divide takes O(log n)
        if(s>=e){
            return;
        }
        int mid = s + (e-s)/2; // here we dont use (s+e)/2 to avoid the error when s and e are too big n might go out of bounds of int range;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        conquer(arr,s,mid,e);    
    }

   public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
 