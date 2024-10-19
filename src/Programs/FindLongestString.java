package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args)
    {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> maxString = strings.stream().max(Comparator.comparing(String::length));
        System.out.println(maxString);
    }
}
