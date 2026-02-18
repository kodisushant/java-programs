import java.util.*;
 class input_array{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        // System.out.println(n);
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int j=0,k=n-1;j<n/2;j++,k--){
            int temp=a[j];
            a[j]=a[k];
            a[k]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}