import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader n = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(n);

        while (true) {
            System.out.println("Enter a year: or Enter 'N' to exit");
            String input = br.readLine();

            if (input.equals("N")) {
                System.out.println("Exiting....");
                break;
            } else {
                int year = Integer.parseInt(input);
                boolean ans = leapTest(year);
                if(ans) {
                    System.out.println("Number of days in the year: 366 days");
                } else {
                    System.out.println("Number of days in the year: 365 days");
                }
            }
        }
    }
    public static boolean leapTest(int year) {
        int test1 = year % 400;
        int test2 = year % 4;
        int test3 = year % 100;

        if(test1 == 0) {
            return true;
        } else if(test3 == 0) {
            return false;
        } else if (test2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
