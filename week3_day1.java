public class week3_day1 {
    public static void main(String[] args) {
        // System.out.println();

        // String str = "Hello World";
        // System.out.println(str); // prints 'o'

        // String str2 = str.substring(0, 5); // prints 'Hello'
        // System.out.println(str2);
        // System.out.println(str.indexOf("o"));

        // System.out.println(str.concat(str2)); // prints 'Hello WorldHello'

        // String s = "pappafap";
        // int count = 0;
        // for(int i=0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     if(c=='p'){
        //         count++;
        //     }
        // }     
        // System.out.println(count);

        // String str = "vamsc the bad guy";
        // int count2 = 0;
        // for(int i=0; i<str.length(); i++){
        //     char c = str.charAt(i);
        //     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        //         count2++;
        //     }
        // }
        // System.out.println(count2);

        String s = "abcdeffedcba";
        int i = 0;
        int j = s.length() - 1;
        int check = 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                check = 0;
                break;
            }
            i++;
            j--;
        }
        if(check ==1){
            System.out.println("YEs");
        } else {
            System.out.println("NO");
        }



    }
}   