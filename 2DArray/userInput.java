import java.util.Scanner;
class userInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Array is :");

        //Printing the whole array ==>

        // for(int i=0; i<r; i++){
        //     for(int j=0; j<c; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
            
        // }

        //Printing the Array column wise ==>

        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}