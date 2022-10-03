public static void selectionSort(int[] arr) {
        int size = arr.length;
        int temp;
        int indexMin;
        for (int i = 0; i < size - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[indexMin]) {
                    arr[indexMin] = arr[j];
                }
            }
            if (indexMin != i) {
                temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }

        for (Integer i : arr) {
            System.out.println("this is array element " + i);
        }

    }
