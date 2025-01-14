package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvens {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> squares = numbers.stream().filter(n -> n%2 != 0).map(n -> n*n).collect(Collectors.toList());
        System.out.println(squares);
    }
}
