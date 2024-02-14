import java.util.Scanner;

class User {
    public String id;
    public int level;

    public User() {
        this.id = "codetree";
        this.level = 10;
    }

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int lev = sc.nextInt();

        User userA = new User();
        User userB = new User(id, lev);

        System.out.println("user " + userA.id + " lv " + userA.level);
        System.out.println("user " + userB.id + " lv " + userB.level);
    }
}