package TCS;

public class ThreeInteger {
    public static int integer(int p, int q, int r) {
        int step = 0;

        // finding the maximum value among three
        int max = Math.max(p, Math.max(q, r));
        int min = Math.min(p, Math.min(q, r));
        int mid = (p + q + r) - (min + max);

        System.out.println(max + " " + min + " " + mid);

        // checking the numbers is already equal
        if (p == q && q == r) {
            return 0;
        }

        if ((max - mid) % 2 != 0 || (mid - min) % 2 != 0) {
            return -1;

        }

        while (max != mid || mid != min) {
            max--;
            min++;
            mid++;
            step++;

            // Recalculate the values
            int newMax = Math.max(max, Math.max(mid, min));
            int newMin = Math.min(max, Math.min(mid, min));
            int newMid = max + mid + min - (newMax + newMin);

            max = newMax;
            min = newMin;
            mid = newMid;
        }

        return step;

    }

    public static void main(String[] args) {
        int p = 1;
        int q = 1;
        int r = 7;
        System.out.println(integer(p, q, r));

    }
}