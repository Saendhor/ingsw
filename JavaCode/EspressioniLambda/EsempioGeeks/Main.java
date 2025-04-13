package EsempioGeeks;

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
@FunctionalInterface
interface FuncInterface {
    // An abstract function
    void abstractFun(int x, int y);

    // A non-abstract (or default) function
    default void normalFun(String suffix) {
       System.out.println("Hello " + suffix);
    }
}

class Main {
    public static void main(String args[]) {
        //Defining the lambda expression associated with specific method of a @FunctionalInterface
        FuncInterface fobj= (int x, int y) -> {
            System.out.println("Eseguo l'operazione");
            System.out.println((10*x) + y);
            System.out.println("Operazione eseguita");
        };

        fobj.normalFun("1st");
        fobj.abstractFun(5, 2);
        fobj.normalFun("2nd");
    }
}