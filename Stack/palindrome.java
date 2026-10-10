import java.util.*;

class palindrome{
    public static void main(String[] args){

        Stack<Character> stack = new Stack<>();

        String word = "madam";
        for(int i=0; i<word.length(); i++){
            stack.push(word.charAt(i));
        }

        System.out.println(stack);

        String newStr="";

        while(!stack.isEmpty()){
            newStr += stack.pop();
        }

        if(word.equals(newStr)) {
            System.out.println("Yes it is palindrome.");
        }else{
            System.out.println("no it is not palindrome.");
        }

   }
}