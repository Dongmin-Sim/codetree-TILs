import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (map.get(num) == null) {
                map.put(k - num, num);
                continue;
            }
            answer++;
        }

        System.out.println(answer);
    }
}