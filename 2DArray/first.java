import java.util.Arrays;
public class first{
    public static void main(String[] args){
        
        // initialize array
        int [] array = {10, 20, 10, 30, 20, 40, 30};
        int [] copy = Arrays.copyOfRange(array, 1, array.length);
        System.out.print(Arrays.toString(copy));
    }
}
