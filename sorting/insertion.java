public static void insertionSort(int[] list) {
        int i;
        int j;
        int temp;
        int size = list.length;
        for (i = 1; i < size; i++) {
            j = i;
            while (j > 0 && (list[j] < list[j-1])) {
               temp = list[j];
               list[j] = list[j-1];
               list[j-1]  = temp ;
               j--;
            }
        }

        for (Integer counter : list) {
            System.out.println("this is the value of i " + counter);
        }
    }
