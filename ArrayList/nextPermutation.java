class nextPermutation {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            for(int j=0; j<arr.length; j++){
                if(j==i){
                    continue;
                }else{
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
}