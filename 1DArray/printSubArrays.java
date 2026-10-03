class printSubArrays{
    public static void main(String[] args){
        int [] arr = {1, 2, 4, 5, 10};

        for(int st=0; st<arr.length; st++){
            for(int en=st; en<arr.length; en++){
                // System.out.print(st+","+en+" ");
                System.out.print("[");
                for(int i=st; i<=en; i++){
                    System.out.print(arr[i]+",");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }
}