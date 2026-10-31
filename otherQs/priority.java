import java.util.*;

class priority{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {7,2,4,1,6,9};

        // PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq  = new PriorityQueue<>();

        int k =3;

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        for(int i=1;i<k;i++){
            pq.remove();
        }

        System.out.print(pq.peek());
        


    }
}