import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Question2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some words: \n");
        String s = br.readLine();
        //write your code here
        String[] str = s.split(" ");

        int i = 0;
        while (i < str.length) {
            String value = str[i];
            char[] y = value.toCharArray();
            y[0] = Character.toUpperCase(y[0]);
            for (char j : y) {
                System.out.print(j);
            }
            System.out.print(" ");
            i++;
        }
    }
}

