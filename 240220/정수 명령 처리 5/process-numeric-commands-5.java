import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String instruction = sc.next();

            if (instruction.equals("push_back")) {
                int num = sc.nextInt();
                pushBack(num);
            } else if (instruction.equals("pop_back")) {
                popBack();
            } else if (instruction.equals("size")) {
                System.out.println(size());
            } else {
                int num = sc.nextInt();
                System.out.println(get(num));
            }

        }
    }

    public static void pushBack(int num) {
        arr.add(num);
    }

    public static void popBack() {
        arr.remove(size() - 1);
    }

    public static int size() {
        return arr.size();
    }

    public static int get(int k) {
        return arr.get(k - 1);
    }

}