import java.util.Scanner;
public class test2 {                        //輸出n個*字號 第三個取代為A
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int i ;
        for(i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("A");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}

