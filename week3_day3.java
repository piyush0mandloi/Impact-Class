




public class week3_day3 {
    public static void main(String[] args) {
        // String s = "1.2.3.4.5";
        // String new_s = s.replace(".", "[.]");
        // System.out.println(new_s);

        // int matrix[][] = {
        //     {1, 2, 3,4},
        //     {4, 5, 6,4},
        //     {7, 8, 9,4}
        // };
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        // System.out.println(matrix[1][2]);

        // String arr[] = {"Tax", "xeron", "neo", "orbit", "titan", "ask", "####"};
        // List<String> newArray = new ArrayList<>();
        // int i = 0;
        // while(i<arr.length){
        //     newArray.add(arr[i]);
        //     if(arr[i].charAt(arr[i].length()-1) != arr[i+1].charAt(0)){
        //         break;
        //     }
        //     i++;
            
        // }
        // System.out.println(newArray);

        // int x = 39631; // 93631
        // String res="";
        // int arr[] = new int[5];
        // for(int k=0; k<5; k++){
        //     arr[k] = x%10;
        //     x = x/10;
        // }
        // int i=0;
        // while(i<=  arr.length){
        //     int temp = arr[i];
        //     arr[i] = arr[i+1];
        //     arr[i+1] = temp;
        //     i+=2;
        // }
        // for(int j = 0; j<arr.length; j++){
        //     res += arr[j];
        // }
        // System.out.println(res);


        // String s = "BikeWay";
        // String t = "Bike";
        // String res = "";
        // for(int i=0; i<s.length(); i++){
        //    char ch = s.charAt(i);
        //    if(t.indexOf(ch) == -1){
        //     res+=ch;
        //    }
        // }
        // System.out.println(res);

        String s = "15abc1";
        int res = 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                res+=(ch.parseInt());
            }
        }
        System.out.println(res);




    }
}
