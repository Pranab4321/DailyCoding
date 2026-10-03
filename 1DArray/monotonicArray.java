class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                inc = false;
                break;
            }
        }
        boolean dec = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                dec = false;
                break;
            }
        }

        if(inc == true || dec == true){
            return true;
        }else{
            return false;
        }

    }
}


// here
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] <= nums[i+1]){
                inc = false;
                break;
            }
        }

        boolean dec = true;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                dec = false;
                break;
            }
        }

        if(inc == true || dec == true){
            return true;
        }else{
            return false;
        }
    }
}