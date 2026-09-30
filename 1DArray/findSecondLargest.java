import java.util.Scanner;
public class findSecondLargest {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<arr.length; i++){
        arr[i]=in.nextInt();
       }
       int lar = Integer.MIN_VALUE;
       int sec = Integer.MIN_VALUE;
       boolean foundsec = false;

       for(int i=0; i<arr.length; i++){
        if(arr[i]>lar){
            sec = lar;
            lar = arr[i];
            if(sec!=Integer.MIN_VALUE){
                foundsec = true;
            }
        }else if(arr[i]<lar && arr[i]>sec){
            sec = arr[i];
            foundsec = true;
        }

       }
       
        if(foundsec){
            System.out.print(sec);
        }else{
            System.out.print(-1);
        }
    }
}