public class NumberTwo {

    public static void main(String[] args) {

        int prime = 1000;

        for (int i = 2; i < prime; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) System.out.println(i);
        }
    }
}
