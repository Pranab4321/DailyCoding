class moveZeros{
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int inserPos = 0;

        for(int i=0; i<nums.length; i++){

                    
            if(nums.length == 1){
                    nums[inserPos] = nums[i];
            }


            if(nums[i] != 0){
                int t = nums[inserPos];
                nums[inserPos] = nums[i];
                nums[i] = t;
                inserPos++;
            }
        }


        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}