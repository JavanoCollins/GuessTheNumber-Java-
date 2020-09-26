import java.io.IOException;
import java.util.Scanner;

public class LuckySeven {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you name");
        String name = sc.next();

        int min = 1;
        int max = 6;
        int dice1 = (int)(Math.random() * (max - min + 1) + min);
        int dice2 = (int)(Math.random() * (max - min + 1) + min);
//
        int total = dice1 + dice2;
        if (total == 7) {
            System.out.println(name + ", ...You rolled 7! You Won!");
        } else {
            System.out.println("I'm sorry " + name + ", you lost. Try again.");
        }
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("You rolled " + total);
    }

}
