package basic;

public class UseStatic {

    // Static:
    // The static keyword is used in java mainly for memory management.
    // It is used with variables, methods, blocks and nested class.
    // It is a keyword that are used for share the same variable or method of a given class.
    // This is used for a constant variable or a method that is the same for every instance of a class.

    static String name="James William"; // class Variable

    public static void display(){
        System.out.println("This is Display Method");
    }

    public static void main(String[] args) {

        UseStatic.name="Jack";
        System.out.println(UseStatic.name);
        UseStatic.display();
    }






}
