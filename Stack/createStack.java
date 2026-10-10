import java.util.Stack;

class createStack{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            stack.push(arr[i]);
        }

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}