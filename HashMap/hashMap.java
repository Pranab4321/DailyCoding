import java.util.HashMap;
class hashMap {
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,1,4,4,3,3,6,5,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        int value = map.getOrDefault(arr[3], 1);
        map.put(arr[3], value);
        value = map.getOrDefault(arr[3], 5)+1;
        for(int num : arr){
            map.put(num, value);
        }
        // arr[3] key --> 1        
        System.out.println(map);
    }
}