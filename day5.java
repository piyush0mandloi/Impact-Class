
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        // *******   1
        // *     *   2
        // *     *   3
        // *******   4
        // *         5
        // *         6
        // *         7

        for(int i=1; i<=7; i++){
            if(i==1 || i==4){
                for(int j=1; j<=7; j++){
                    System.out.print("*");
                }
            }else if(i==2 || i==3){
                System.out.print("*");
                for(int j=1; j<=5; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }else if(i==5 || i==6 || i==7){
                System.out.print("*");
                for(int j=1; j<=6; j++){
                    System.out.print(" ");
                }                
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        System.out.println("Enter the elements of the first array:");
        for(int i=0; i<n1; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for(int i=0; i<n2; i++){
            arr2[i] = scanner.nextInt();
        }

        int x = 1;
        for(int i=0; i<arr1.length; i++){
            if((arr1[i] >= arr2[i]) && arr1.length == arr2.length){
                x = 1;
            }else{
                x=0;
            }
        }
        if(x==1){
            System.out.println("Compatible");
        }else{
            System.out.println("Not Compatible");
        }

    }
}
