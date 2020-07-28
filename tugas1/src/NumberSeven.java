import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSeven {

    public static void main(String[] args) {

        List<Integer> range = IntStream
                .rangeClosed(1700, 1800)
                .boxed()
                .collect(Collectors.toList());

        range.forEach(NumberSeven::leapYear);
    }

    private static void leapYear(Integer y) {

        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " adalah tahun kabisat");
                }else System.out.println(y + " bukan tahun kabisat");
            }else System.out.println(y + " adalah tahun kabisat");
        }else System.out.println(y + " bukan tahun kabisat");

    }
}
