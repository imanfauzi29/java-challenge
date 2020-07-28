import java.util.List;
import java.util.stream.Collectors;

public class NumberFour {

    public static void main(String[] args) {

        var list = List.of("Aku", "bukanlah", "superman", "Aku", "juga", "bisa", "nangis");

        var msg = list.stream().distinct().collect(Collectors.toList());
        System.out.println(msg);
    }
}
