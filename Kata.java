public class Kata {
    public static Integer prevMultOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 0) {
                return n;
            }
            n = n / 10;
        }
        return null;
    }
}