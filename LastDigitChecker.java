public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int k) {
        if(isValid(x) && isValid(y) && isValid(k)) {
            x %= 10;
            y %= 10;
            k %= 10;

            if(x == y || x == k || y == k) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int x) {
        if((x < 10) || (x > 1000)) {
            return false;
        }

        return true;
    }
}