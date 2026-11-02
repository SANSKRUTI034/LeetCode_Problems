class Solution {
    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        for (int i = 1; i <= x; i++) {

            long answer = (long)i * i;

            if (answer == x) {
                return i;
            }
            else if (answer > x) {
                return i - 1;
            }
        }

        return 0;
    }
}