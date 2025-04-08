import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        int result = Stream.of("ciao", "sono", "Simone")
        .mapToInt(x -> x.length())
        .sum();

        System.out.println("Printing the result");
        System.out.println(result);
    }
    
}
