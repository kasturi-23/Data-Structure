import java.util.Scanner;

class Main{

    public static void revarr(int[] arr, int n){
        int i,j;
        int[] revarr = new int[n];
        for (i=0;i<n;i++){
            revarr[i]= arr[n-i-1];
        }

        for(i=0;i<n;i++){
            System.out.println("The reversed string is: ");
            System.out.println(revarr[i]);
        }
    }
    public static  void main(String[] args){
      int i, max = 0,min = 0, n, j;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        n= sc.nextInt();
        int arr[]= new int[n] ;
        for(i=0;i<n;i++){
            System.out.print(i+1+"st Element is : ");
            int num= sc.nextInt();
            arr[i]= num;
        }
        revarr(arr,n);
    }
}
