import java.util.Scanner;
public class InvertedTriangle{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();
            for(int i = 1; i <= rows; i++){
                for(int j = rows; j >= i; j--){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}

    
// Language: java
