import java.util.HashMap;
class isomorphicString {
    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        HashMap <Character, Integer> smap = new HashMap<>();
        HashMap <Character, Integer> tmap = new HashMap<>();


        for(int i=0; i<s.length(); i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            smap.put(sch, smap.getOrDefault(sch,0)+1);
            tmap.put(tch, tmap.getOrDefault(tch,0)+1);
        }

        if(smap.size() == tmap.size()){
            for(int i=0; i<s.length(); i++){
                char ch = t.charAt(i);
                s = s.replace(s.charAt(i), ch);
            }

            System.out.println(s);
            if(s.equals(t)){
                System.out.println("It is isomorphic");
            }
        }
        

    }
}