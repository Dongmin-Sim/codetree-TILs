import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String inst = sc.next();

            if (inst.equals("push_back")) {
                int num = sc.nextInt();
                list.add(num);
            } else if (inst.equals("push_front")) {
                int num = sc.nextInt();
                list.addFirst(num);
            } else if (inst.equals("pop_front")) {
                System.out.println(list.pollFirst());;
            } else if (inst.equals("pop_back")) {
                System.out.println(list.pollLast());
            } else if (inst.equals("size")) {
                System.out.println(list.size());
            } else if (inst.equals("empty")) {
                if (list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (inst.equals("front")) {
                System.out.println(list.peekFirst());
                ;
            } else {
                System.out.println(list.peekLast());;
            } 
        }
    }
}