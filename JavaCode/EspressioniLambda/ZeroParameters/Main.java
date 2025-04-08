package ZeroParameters;

import java.util.stream.Stream;

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

    Calculator(ZeroParameter zeroParam) {
        this.zeroParam = zeroParam;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator firstCalculator = new Calculator();
        firstCalculator.zeroParam.show();

        Calculator secondCalculator = new Calculator(
            () -> {
                System.out.println("Non credo sia possibile credere a quello che sto facendo");
            }
        );
        secondCalculator.zeroParam.show();

        int result = Stream.of("ciao", "sono", "Simone")
                            .mapToInt(x->x.length())
                            .sum();

        System.out.println("Printing the result of stream");
        System.out.println(result);

    }
    
}
