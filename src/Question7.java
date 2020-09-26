import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        String read = br.readLine();

        while (!read.equals("end")) {
            arr.add(read);
            read = br.readLine();
        }

        for (String x : arr) {
            System.out.println(x);
        }
    }
}