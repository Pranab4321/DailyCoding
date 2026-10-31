
class nextGreaterElement1 {
    public static void main(String[] args){
        int[] num1 = {1,2,3,4};
        int[] num2 = {6,5,4,3,2,1,7};

        int[] result = new int[num1.length];
        for(int i=0; i<num1.length; i++){
            int index = -1;
            for(int j=0; j<num2.length; j++){
                if(num2[j] == num1[i]){
                    index = j;
                }
            }

            result[i] = -1;

            for(int j=index+1; j<num2.length; j++){
                if(num2[index] < num2[j]){
                    result[i] = num2[j];
                    break;
                }
            }
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}


// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {

//         int[] result = new int[nums1.length];

//         for (int i = 0; i < nums1.length; i++) {

//             int index = 0;

//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j]) {
//                     index = j;
//                     break;
//                 }
//             }

//             result[i] = -1;

//             for (int j = index + 1; j < nums2.length; j++) {
//                 if (nums2[j] > nums1[i]) {
//                     result[i] = nums2[j];
//                     break;
//                 }
//             }
//         }

//         return result;
//     }
// }