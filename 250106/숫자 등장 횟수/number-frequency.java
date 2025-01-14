import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            System.out.print(map.getOrDefault(num, 0) + " ");
        }
    }
}