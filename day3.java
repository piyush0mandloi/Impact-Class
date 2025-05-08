
import java.util.Scanner;

public class day3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int square = n*n;
        // int reversedNumber = 0;
        // while(n!=0){
        //     int digit = n%10;
        //     reversedNumber = reversedNumber*10 + digit;
        //     n = n/10;
        // }
        // int newNo = reversedNumber*reversedNumber;
        // reversedNumber = 0;
        // while(newNo!=0){
        //     int digit = newNo%10;
        //     reversedNumber = reversedNumber*10 + digit;
        //     newNo = newNo/10;
        // }
        // if (square == reversedNumber){
        //     System.out.println("Adam's number");
        // }else{
        //     System.out.println("Not Adam's number");
        // }


        // int square = (int)Math.pow(n, 2);
        // int digitCount = 0;
        // int temp = n;
        // while(temp!=0){
        //     temp = temp/10;
        //     digitCount++;
        // }
        // int split1 = square%((int)Math.pow(10,digitCount));
        // int split2 = square/((int)Math.pow(10,digitCount));
        // int sum = split1 + split2;
        // if (sum == n){
        //     System.out.println("Kaprekar's number");
        // }else{
        //     System.out.println("Not Kaprekar's number");
        // }


        // convert to binary
        // int res = 0;
        // while(n>0){
        //     int digit = n%2;
        //     res = res*10 + digit;
        //     n = n/2;
        // }
        // int ans = 0;
        // while(res>0){
        //     int digit = res%10;
        //     ans = ans*10 + digit;
        //     res = res/10;
        // }
        // System.out.println(ans);        

        // for(int i=0; i<3; i++){
        //     for(int j=1; j<4; j++){
        //         int x = 2*i + j;
        //         System.out.print(x + " ");
        //     }
        //     System.out.println();
        // }


        for(int i=1; i<=n;i++){
            int space = n-i;
            int star = i;

            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}