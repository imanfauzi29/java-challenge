public class NumberThree {

    private static class controlFlow {

        public static String oddEvent(int x) {

            String results = "";

            if (x % 2 == 1) {
                if (x % 5 != 0) {
                    results = "Imperio Aberto";
                } else {
                    results = "Imperio";
                }
            } else if (x % 2 == 0) {
                if (x % 4 == 0) {
                    results = "Crucio Reducto";
                } else {
                    results = "Crucio";
                }
            }
            return results;
        }
    }
        public static void main(String[] args) {

            var controlFlow = new controlFlow();
            System.out.println(controlFlow.oddEvent(27));
        }
}