 public static void quickSort(int[] arr , int low , int high){
        if ( low < high){

            // the position of the pivot after partitioning
            int p = partition(arr, low, high);

            quickSort(arr , low , p-1);

            quickSort(arr , p+1 , high);

        }
    }

    static void swap(int[] arr, int low, int pivot){
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    static int partition(int[] arr, int low, int high){
        int p = low, j;
        for(j=low+1; j <= high; j++)
            if(arr[j] < arr[low])
                swap(arr, ++p, j);

        swap(arr, low, p);
        return p;
    }
