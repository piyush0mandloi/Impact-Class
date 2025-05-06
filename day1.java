import java.util.*;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = n+b;
        // System.out.println("Sum of n and b is: " + sum);


        // int number = sc.nextInt();
        // int first_digit = number % 10;
        // int second_digit = number / 1000;
        // System.out.println(first_digit+ second_digit);


        // Read three digit number ,  and sum the all the digits of the number
        int number1 = sc.nextInt();
        int first_digit1 = number1 % 10;
        int second_digit1 = (number1 / 10) % 10;
        int third_digit1 = number1 / 100;
        System.out.println(first_digit1 + second_digit1 + third_digit1);

        int res = 0;
        int temp = number1;
        while (temp > 0) {
            res =res + temp % 10;
            temp = temp/10;
        }
        System.out.println(res);

    }
}