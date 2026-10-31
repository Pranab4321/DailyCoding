class nextPermutation {
    public static void main(String[] args){
        int[] nums = {1,3,5,4,2};
        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i+1, n-1);

        for(int k=0; k<n; k++){
            System.out.print(nums[k]+" ");
        }
    }

    private static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void reverse(int[] nums, int l, int r){
        while(l<r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}