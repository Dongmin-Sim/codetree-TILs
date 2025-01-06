import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] words = sc.nextLine().split(" ");
            String command = words[0];
            Integer key = Integer.parseInt(words[1]);

            if (command.equals("add")) {
                map.put(key, Integer.parseInt(words[2]));
            } else if (command.equals("remove")) {
                map.remove(key);
            } else {
                if (map.containsKey(key)) {
                    System.out.println(map.get(key));
                } else {
                    System.out.println("None");
                }
            }
        }
    }
}