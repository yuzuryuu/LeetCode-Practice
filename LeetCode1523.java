public class LeetCode1523 {
        public static int countOdds(int low, int high) {
            int n = (high - low)/2;
            if (high%2 != 0 || low%2 != 0){
                n++;
            }
            return n;
        }
    public static void main(String[] args) {
        int low = 3, high = 7;

        int odds = countOdds(low, high);
        System.out.println("Count of odd numbers is " + odds);
    }
}
