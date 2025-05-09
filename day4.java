public class day4 {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int a=5;
        for(int i =1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int a1=4;
        for(int i=1; i<=a1; i++){
            for(int j=1; j<=(a1-i); j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int a2=5;
        for(int i=a2; i>=1; i--){
            for(int j=1; j<=(i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int a3=5;
        for(int i=a3; i>=1; i--){
            for(int j=(a3-i); j>=1; j--){
                System.out.print(" ");
            }
            for(int k=i; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int a4=5;
        for(int i=0; i<a4; i++){
            if(i==0 || i==a4-1){
                for(int j=0; j<a4; j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0; j<a4; j++){
                    if(j==0 || j==a4-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

    }
}
