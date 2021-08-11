import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0;

        do {
            System.out.print("Sayı: ");
            number = input.nextInt();

            if ((number % 2 == 0) && (number % 4 == 0)) {
                total += number;
            }
        } while (number % 2 == 0);

        System.out.println("2'ye ve 4'e tam bölünen sayıların toplamı: " + total);
    }
}
