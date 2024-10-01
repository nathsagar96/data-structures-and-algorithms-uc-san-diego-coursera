import java.util.Scanner;

class MaxPairwiseProductNaive {

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
        long max_product = 0;
        for (int first = 0; first < numbers.length; first++) {
            for (int second = first + 1; second < numbers.length; second++) {
                max_product = Math.max(max_product, numbers[first] * numbers[second]);
            }
        }
        return max_product;
    }
}
