package Programs;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        int firstElement = numbers.stream().findFirst().orElse(-1) ;
        System.out.println(firstElement);
    }
}
