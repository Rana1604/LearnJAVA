package loop;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        // User will give the number and it will print as a Row Basis

        // Output
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        Scanner number=new Scanner(System.in);
        System.out.println("Enter the Number of Row");

        int numOfRow=number.nextInt();

        for(int i=1; i<=numOfRow;i++){

            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }





    }
}


