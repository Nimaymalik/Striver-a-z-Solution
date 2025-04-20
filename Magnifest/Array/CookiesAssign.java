package Magnifest.Array;

import java.util.Arrays;

public class CookiesAssign {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        // total number of children and cookie avaliable
        int ChildrenNumber = g.length;
        int CookieNumber = s.length;

        int ChildrenCount = 0;

        int greedFactor = 0;
        int cookieSize = 0;

        while (greedFactor < ChildrenNumber) {
            while ((cookieSize < CookieNumber) && s[cookieSize] < g[greedFactor]) {
                cookieSize++;

            }

            if (cookieSize < CookieNumber) {
                ChildrenCount++;
                cookieSize++;

            } else {
                break;
            }
            greedFactor++;

        }
        return ChildrenCount;
    }

    public static void main(String[] args) {

    }

}
