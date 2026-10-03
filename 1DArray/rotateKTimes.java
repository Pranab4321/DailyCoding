import java.util.Scanner;

public class rotateKTimes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");

        int n = sc.nextInt();
        System.out.println("Enter the values of the array");

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value for k");
        int k = sc.nextInt();

        rotate(0, n-1, arr);
        rotate(0, k-1, arr);
        rotate(k, n-1, arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    //Create the function for rotating the array

    public static void rotate(int s, int e, int[] arr){
        // while(e>s){
        //     int t = arr[s];
        //     arr[s] = arr[e];
        //     arr[e] = t;
        //     s++;
        //     e--;
        // }

        for(int i=s; i<e; i++){
            int t = arr[i];
            arr[i] = arr[e];
            arr[e] = t;

            e--;
        }
    }
}