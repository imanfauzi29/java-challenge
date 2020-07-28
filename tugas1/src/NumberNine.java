import java.util.ArrayList;
import java.util.Scanner;

public class NumberNine {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter: ");

        String text = scnr.nextLine();

        char[] stringToChar = text.toCharArray();

        var myArray = new ArrayList<Character>();
        for (char out : stringToChar) {
            myArray.add(out);
        }

        System.out.println(myArray.stream().count());

    }
}
