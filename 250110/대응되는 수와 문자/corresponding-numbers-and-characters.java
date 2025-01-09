import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] list = new String[n + 1];
        HashMap<String, Integer> map = new HashMap<>();

        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list[i + 1] = sc.next();
            map.put(list[i + 1], i + 1);
        }

        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (Character.isDigit(s.charAt(0))) {
                System.out.println(list[Integer.parseInt(s)]);
            } else {
                System.out.println(map.get(s));;
            }
        }
    }
}