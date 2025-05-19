

public class week2_day3 {
    public static void main(String[] args) {
        
        // int n = 10101001;
        // String num1 = "";
        // String num2 = "";
        // while(n>0){
        //     int x = n%10;
        //     n = n/10;
        //     if(x==0){
        //         num1 = num1+"0";
        //     }else{
        //         num2 = num2+"1";
        //     }
        // }

        // String res = num2+num1;
        // System.out.println(res);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements in the array:");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the elements of the array:");
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // int temp[] = arr.clone();
        // int i = 0;
        // int j = arr.length-1;
        // while(i<=j){
        //     if(arr[i]%2==0){
        //         temp[i] = arr[i];
        //     }else{
        //         temp[j] = arr[i];
        //     }

        //     if(arr[j]%2==0){
        //         temp[i] = arr[j];
        //     }else{
        //         temp[j] = arr[j];
        //     }
        //     i++;
        //     j--;
        // }
        // for(int k=0; k<temp.length; k++){
        //     System.out.print(temp[k]+" ");
        // }

        int n=5;
        int arr[] = {4,2,0,-1,-3};
        int temp[] = new int[n];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                temp[n]= arr[i];
            }
        }



    }
}
