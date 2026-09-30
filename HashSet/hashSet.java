import java.util.HashSet;
import java.util.Iterator;
class hashSet{
    public static void main(String[] args){
        //creation
        HashSet<Integer> set = new HashSet<>();
        //insertion
        set.add(1);
        set.add(2);
        set.add(54);
        set.add(4);
        //size
        System.out.println(set.size());
        //Searching
        if(set.contains(55)){
            System.out.println("set contains 1 ");
        }else{
            System.out.println("Does not contain.");
        }

        //Delete
        set.remove(1);
        System.out.println(set);

        //Iterator
        System.out.println("Iterator is here:- ");

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}