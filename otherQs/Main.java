import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Write your code here
        String arr[] = s.split("");
        for(int i=0; i<arr.length; i++){
            String ch = arr[i];
            int count = 0;
            while(i<arr.length && arr[i].equals(ch)){
                count++;
                i++;                
            }
            // print(ch, count);
            System.out.print(count);
            i--;
            
        }

    }

    // public static void print(String ch, int count){
    //     System.out.print(ch);
    //     System.out.print(count);
    // } 
}