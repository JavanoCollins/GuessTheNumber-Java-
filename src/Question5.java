import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> evenNums = new ArrayList<>();
        ArrayList<String> oddNums = new ArrayList<>();
        ArrayList<String> all = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter some words");

        while (true) {
            String read = br.readLine();
            if (read.isEmpty()) {
                break;
            }
            if (read.length() % 2 == 0) {
                evenNums.add(read);
            } else {
                oddNums.add(read);
            }
        }

        for (String evenNum : evenNums) {
            System.out.println(evenNum + " " + evenNum);
        }
        for (String oddNum : oddNums) {
            System.out.println(oddNum + " " + oddNum + " " + oddNum);
        }

    }
}
