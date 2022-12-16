public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int n = humanYears;
        if (n == 1) {
            return new int[]{n, 15, 15};
        }
        if (n == 2) {
            return new int[]{n, 15 + 9, 15 + 9};
        }

        return new int[]{n, 15 + 9 + 4 * (n - 2), 15 + 9 + 5 * (n - 2)};

    }

}