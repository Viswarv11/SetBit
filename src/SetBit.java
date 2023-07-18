import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int number1 = scanner.nextInt();
        System.out.println("Enter a number 2:");
        int number2 = scanner.nextInt();
        System.out.println(setbit(number1, number2));
    }

    private static int setbit(int number_1, int number_2) {
        int count = 0;
        count = count | 1 << number_1;
        count = count | 1 << number_2;
        return count;

    }
}
