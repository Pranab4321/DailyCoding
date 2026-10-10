class rotateKTimes{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        k = k%n;

        rotate(0,n-1,arr);
        rotate(0,k-1,arr);
        rotate(k,n-1,arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }


    }

    public static int[] rotate(int s, int e, int[] arr){
        
        while(s<e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }

        return arr;
    }
}