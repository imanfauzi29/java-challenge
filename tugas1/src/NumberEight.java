import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberEight {

    public static void main(String[] args) {

        var numbers = List.of(3, 1, 7, 4, 5, 6, 8, 2);

        int max = Collections.max(numbers);
        var result = numbers.stream().reduce(0, Integer::sum) - max;
        System.out.println(result);
    }
}
