import java.util.Scanner;
public class test3 {                            //九宮格
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int x =0 ;
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x=x+1;
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

