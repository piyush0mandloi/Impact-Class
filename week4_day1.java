public class week4_day1{
    public static void main(String[] args) {
          
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array");
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            
        System.out.println();
        int arr2[] = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr2, 0, arr2.length - 1);
        System.out.println("Sorted array using Merge Sort");
        for (int i=0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");   
        System.out.println();

    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}