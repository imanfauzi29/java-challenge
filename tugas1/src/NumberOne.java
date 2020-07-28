public class NumberOne {

    private static class math {

        public static int penjumlahan(int x, int y) {
            return Math.addExact(x, y);
        }

        public static int pengurangan(int x, int y) {
            return Math.subtractExact(x, y);
        }

        public static  int perpangkatan(int x, int y) {
            return (int) Math.pow(x, y);
        }

        public static int pengakaran(int z) {
            return (int) Math.sqrt(z);
        }

        public static int pembagian(int x, int y) {
            return Math.floorDiv(x, y);
        }

        public static int perkalian(int x, int y) {
            return Math.multiplyExact(x, y);
        }
    }

    public static void main(String[] args) {
        int x = 64, y = 2;

        var math = new math();
        System.out.println("penjumlahan dari " + x + " dan " + y + " adalah " + math.penjumlahan(x, y));
        System.out.println("pengurangan dari " + x + " dan " + y + " adalah " + math.pengurangan(x, y));
        System.out.println("perpangkatan dari " + x + " dan " + y + " adalah " + math.perpangkatan(x, y));
        System.out.println("pengakaran dari " + x + " adalah " + math.pengakaran(x));
        System.out.println("pengakaran dari " + y + " adalah " + math.pengakaran(y));
        System.out.println("pembagian dari " + x + " dan " + y + " adalah " + math.pembagian(x, y));
        System.out.println("perkalian dari " + x + " dan " + y + " adalah " + math.perkalian(x, y));
    }
}
