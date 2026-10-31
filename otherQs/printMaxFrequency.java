class printMaxFrequency{
    public static void main(String[] args){
        int arr[] ={2,5,2,8,5,2,9};
        int n = arr.length;

        int prev = 0;
        int max = arr[0];
        int count = 1;
        for(int i=0; i<n; i++){


            for(int j=i; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count>prev){
                max = arr[i];
            }
            prev = count;
        }

        System.out.print(max+" "+count);
    }
}