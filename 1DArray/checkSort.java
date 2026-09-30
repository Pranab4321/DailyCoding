public class checkSort{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int fir = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>fir){
                fir = arr[i];
                sec = arr[i+1];
            }
            if(sec<fir){
                System.out.println("The array is not sorted.");
                return;
            }
        }
        System.out.println("The array is sorted.");
    }
}