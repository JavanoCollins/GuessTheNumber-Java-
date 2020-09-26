
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question1 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers: ");

        String str;
        int input;
        int sequence = 1;
        int num = 1;

        for (int i = 0; i < 10; i++) {
            str = br.readLine();
            input = Integer.parseInt(str);
            list.add(input);
        }

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i - 1))) {
                sequence++;
            } else {
                sequence = 1;
            }
            if(sequence > num) {
                num = sequence;
            }
        }
        System.out.println("Longest sequence: " + num);
    }
}