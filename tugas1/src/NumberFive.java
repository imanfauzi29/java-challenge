public class NumberFive {

    private static class filmRating {
        public static String rating(int x) {
            String result;

            if(x >= 20) result = "DEWASA";
            else if(x >= 13) result = "REMAJA";
            else if(x >= 9) result = "BIMBINGAN ORANG TUA";
            else if (x < 9) result = "SEMUA USIA";
            else result = "MASUKAN ANGKA";

            return result;
        }
    }

    public static void main(String[] args) {

        var filmRating = new filmRating();
        System.out.println(filmRating.rating(7));
    }
}
