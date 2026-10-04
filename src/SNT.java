import java.util.Scanner;

public class SNT {
    public static boolean isPrime (int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i*i<=n;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void printResult(){
        Scanner a = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên tố: ");
        int n = a.nextInt();

        if(isPrime(n)){
            System.out.println(n+" là số nguyên tố.");
        }
        else{
            System.out.print(n+" không phải là số nguyên tố.");
        }
    }
}
