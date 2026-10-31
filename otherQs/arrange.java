import java.util.Scanner;

public class arrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,2,8,1,4,7,6,5};
        int n = arr.length;

        // Write your code here
        int newArr[] = new int[n];
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                newArr[count] = arr[i];
                count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                newArr[count] = arr[i];
                count++;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(newArr[i]+" ");
        }

    sc.close();
    }
}