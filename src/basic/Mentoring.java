package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mentoring {


      // For Loop

    public Mentoring() {
    }

    public static void main(String[] args) {

     Scanner num = new Scanner(System.in);
     System.out.println("Enter the Number of Row");
     int numberOfRow = num.nextInt();


     for (int x = 1; x <= numberOfRow; x++) {


         for (int y = 1; y <= x; y++) {
             System.out.print(y+" ");
         }
         System.out.println();

     }


 }


    }



























































