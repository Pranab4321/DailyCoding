import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//HashMap is used to contain key value pair type data

class hashMap{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        //map is unordered
        
        //insert
        map.put("India", 102);
        map.put("China", 222);
        map.put("Indonesia", 442);
        map.put("US", 445);

        System.out.println(map);   //Printing Map Values

        map.put("US", 334);
        System.out.println(map);

        //Search
        if(map.containsKey("Indonesia")){
            System.out.println("Here: "+ map.get("Indonesia"));
        }else{
            System.out.println("It is not present.");
        }

        System.out.println(map.get("pakistan"));

        //Iteration in Map:- entrySet()

        System.out.println("Here is the entrySet.:");
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration using keySet()
        Set<String> keys = map.keySet();

        for(String key : keys){
            System.out.println("key "+ map.get(key));
        }

        //Delete pair from map
        map.remove("china");
    }
}