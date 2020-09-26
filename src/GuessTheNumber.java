import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Guess A Number Between 1 and 20: ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int min = 1;
        int max = 2;
        int number = (int)(Math.random() * (max - min + 1) + min);

        if(input == number) {
            System.out.println("You won!");
        } else if (input > number) {
            System.out.println("The number you entered was too large");
        } else {
            System.out.println("The number you entered is too small");
        }
        System.out.println("Number: " + number);

    }
}
