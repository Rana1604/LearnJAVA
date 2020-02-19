package basic;


import java.sql.SQLOutput;

public class MyClass {


    public double doSummation() {
        int a = 32;
        int b = 22;
        int Summation = a + b;
        System.out.println("Summation is =" + Summation);
        return Summation;

    }

    public int doDivision(int num1, int num2) {
        int number1 = 56;
        int number2 = 99;
        int division = number1 / number2;

        System.out.println("Division is =" + division);
       return division;

    }

    public static void main(String[] args) {

        MyClass mc = new MyClass();
         mc.doSummation();


    }
}



