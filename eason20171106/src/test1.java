import java.util.Scanner;
public class test1 {                        //a壘加到b
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        int i ;
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a<b){
            for(i=a;i<=b;i++){
                sum=i+sum;
            }
            System.out.println(sum);
        }else{
            for(i=a;i>=b;i--){
                sum=i+sum;
            }
            System.out.println(sum);
        }
    }
}
