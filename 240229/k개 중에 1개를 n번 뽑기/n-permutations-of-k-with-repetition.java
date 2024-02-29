import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static int n;
    public static int k;
    public static void print() {
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);
    }

    public static void choose(int cirNum) {
        if (cirNum == n + 1) {
            print();
            return;
        }

        for (int i = 1; i <= k; i++) {
            answer.add(i);
            choose(cirNum + 1);
            answer.remove(answer.size() - 1);
        }
    }
}