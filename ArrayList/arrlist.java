import java.util.*;
public class arrlist {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(11);
        for (int num : list){
            System.out.println("num "+num);
        }
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);
    }
}