import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        //write your code here
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        ArrayList<String> list2 = (ArrayList<String>) list.clone();

        for (int i = 0; i < M; i++) {
            list2.add(list.get(0));
            list2.remove(0);
        }

        for (String str : list2) {
            System.out.println(str);
        }
    }
}
