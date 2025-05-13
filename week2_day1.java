import java.util.*;

public class week2_day1 {
    public static List<Integer> res(int[] arr) {
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        return Arrays.asList(sum, evenSum, oddSum, min, max);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> result = res(data);
        System.out.println(result);  // Output: [36, 20, 16, 1, 8]
    }
}
