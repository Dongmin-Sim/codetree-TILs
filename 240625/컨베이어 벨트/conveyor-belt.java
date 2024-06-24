import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextInt());
        }

        for (int i = 0; i < t; i++) {
            int temp = list.remove(list.size() - 1);
            int temp2 = list2.remove(list2.size() - 1);
            list.add(0, temp2);
            list2.add(0, temp);
        }
        list.forEach(e-> System.out.print(e + " "));
        System.out.println();
        list2.forEach(e-> System.out.print(e + " "));
    }
}