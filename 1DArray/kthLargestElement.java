import java.util.Arrays;

class kthLargestElement {
    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};
        Arrays.sort(arr);

        int k=4;
        int term = 0;
        for(int i=0; i<arr.length; i++){
            if(i+1 == k){
                term = arr[i];
            }
        }

        System.out.print(term);
        System.out.print(term);


        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        
    }
}
