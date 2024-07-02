import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int ans;
    public static ArrayList<Integer> list =  new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        countBeautifulNumber(0);
        System.out.println(ans);
    }

    private static void countBeautifulNumber(int cnt) {
        if (cnt == n) {
            if (isBeautiful()) {
                ans++;
            }
            return;
        }

        for (int i = 1; i < 4; i++) {
            list.add(i);
            countBeautifulNumber(cnt + 1);
            list.remove(list.size() - 1);
        }
    }

    private static boolean isBeautiful() {
        for (int i = 0; i < n; i+=list.get(i)) {
            if (i + list.get(i) - 1 >= n) {
                return false;
            }

            for (int j = i; j < i + list.get(i); j++) {
                if (list.get(j) != list.get(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}