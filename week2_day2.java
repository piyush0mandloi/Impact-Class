public class week2_day2 {
    public static void main(String[] args) {
        int m = 4;
        int arr[] = {3, 3, 3, 3};
        int count = 1;
        int laod = 0;
        for (int i = 0; i < arr.length; i++) {
            if (laod+arr[i] < m) {
                laod += arr[i];
            }else{
                laod = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
