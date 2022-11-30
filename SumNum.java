public class SumNum {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        // System.out.println("The sum of first" + n + "numbers is");
        for (int i = 1; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first  " + n + " number is " + sum);
    }
}
