package Facade;
//Oss: not importing Facade.records.*; because, since we have a "facade", we're only using "Calculator.java"

/* Client */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addRAM();
        calculator.addSSD();

        calculator.printComponents();
        calculator.getPrice();
    }
}
