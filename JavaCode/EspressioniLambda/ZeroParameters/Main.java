package ZeroParameters;

interface ZeroParameter {
    void show();
}


class Calculator {
    ZeroParameter zeroParam;

    Calculator() {
        this.zeroParam = () -> {
            System.out.println("I'm inside the constructor!");
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator currenCalculator = new Calculator();
        currenCalculator.zeroParam.show();

    }
    
}
