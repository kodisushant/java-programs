import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
        }
    static void isPrime(int n){
        int count =0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
                break;
            }
            else
                continue;
        }
        if(count==0){
            System.out.println(n+" is a Prime Number");
        }
        else
            System.out.println(n+" is not a Prime Number");
    }
}
