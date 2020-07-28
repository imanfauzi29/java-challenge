import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberSix {



    public static void main(String[] args) {
        List<Integer> range = IntStream
                .rangeClosed(1, 1000)
                .boxed()
                .collect(Collectors.toList());

        for (Integer integer : range) {
            System.out.println(oddEvent(integer));
        }
    }

    private static String oddEvent(Integer x) {

        if(x % 100 == 0) return "kelipatan seratus";
        else if (x % 2 == 1) {
            if(x % 7 == 1) return "Ganjil kelipatan tujuh";
            return "Ganjil";
        }
        else if (x % 2 == 0) {
            if(x % 8 == 0) return "Genap kelipatan delapan";
            return "Genap";
        }

        return null;
    }
}
