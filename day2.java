
import java.util.Scanner;

public class day2 {
    public static void main(String args[]){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int first = n/100;
        // int second = (n/10)%10;
        // int third = n%10;
        // int res = third*100 + second*10 + first;
        // System.out.println(res);

        int x = sc.nextInt();
        if (x%2==0 && x/10==0 && x!=0){
            System.out.println("Even");
        }
        else if(x%2==1 && x/10==0){
            System.out.println("Odd");
        }
        else if(x==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Not a single digit number");
        }

    }
}
