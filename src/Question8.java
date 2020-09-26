import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class Question8 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            String numStr = br.readLine();
            int num = Integer.parseInt(numStr);

            arr.add(num);
        }
        for (int i = 0; i < arr.size(); i++) {
            Collections.sort(arr);
        }

        for (Integer a : arr) {
            System.out.println(a);
        }
    }
}