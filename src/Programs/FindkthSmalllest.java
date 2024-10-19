package Programs;

import java.util.Arrays;

public class FindkthSmalllest {
    public static void main(String[] args){
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 5;
        int kthSmallest = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1) ;
        System.out.println(kthSmallest);
    }
}
