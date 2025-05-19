public class week2_day4 {
    public static int[] add(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] res = new int[n];
        int carry = 0;
        for (int i = 0; i < n; i++) {
            int sum = arr1[i] + arr2[i] + carry;
            carry = sum / 10;
            res[i] = sum % 10;
        }
        // If there is a carry left, create a new array with extra space
        if (carry > 0) {
            int[] newRes = new int[n + 1];
            System.arraycopy(res, 0, newRes, 0, n);
            newRes[n] = carry;
            return newRes;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3}; // 342
        int[] arr2 = {5, 6, 4}; // 465
        int[] result = add(arr1, arr2); // expected [7, 0, 8] which is 807

        // Print the result
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}