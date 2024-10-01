import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstDigit = input.nextInt();
        int secondDigit = input.nextInt();

        System.out.println(sumOfDigits(firstDigit, secondDigit));

        input.close();
    }

    static int sumOfDigits(int firstDigit, int secondDigit) {
        return firstDigit + secondDigit;
    }

}