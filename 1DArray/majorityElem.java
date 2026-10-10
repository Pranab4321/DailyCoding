public class majorityElem {
    public static void main(String[] args){

        int[] arr = {1,1,1,2,2};
        int cand = 0;
        int count = 0;

        for(int n : arr){
            if(count == 0){
                cand = n;
            }

            if(n == cand){
                count++;
            }else{
                count--;
            }
        }

        System.out.println(cand);

    }
}