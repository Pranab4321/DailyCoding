import java.util.*;
class firstMissing{
    public static void main(String[] args){
        // int[] arr = {1,2,0};
        int[] arr = {3,4,-1,1};
        int n = arr.length;
        int i=0;

        while(i<n){
            int correctIndex = arr[i]-1;
            if(arr[i]>1 && arr[i]<n && arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int k=0; k<n; k++){
            if(arr[k]!=k+1){
                System.out.println(k+1);
                return;
            }
        }

        System.out.println(n+1);
        
    }
}