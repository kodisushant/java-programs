import java.util.Arrays;

public class swap_using_methods {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int arr[]={a,b};
        swap(arr);
        a=arr[0];
        b=arr[1];
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<5;i++){
            int count=0;
        }
        // System.out.println(count); this is wrong
        int x;
        System.out.println(x);
    }
    static void swap(int a[]){
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;

    }
}
