import java.util.*;
public class hashset {
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(11);
        for (int num : set){
            System.out.println(num);
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list.get(1));
    }
}