import java.util.Arrays;
import java.util.Scanner;

class MaxPairwiseProductOptimized {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextLong();
        }
        System.out.println(maxPairwiseProduct(numbers));
        input.close();
    }

    static long maxPairwiseProduct(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}