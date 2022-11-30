public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 12, 46, 72, 5, 11 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array is " + sum);
    }
}
