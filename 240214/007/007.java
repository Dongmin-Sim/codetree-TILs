import java.util.Scanner;

class Agent {
    public String code, location;
    public int time;

    public Agent(String code, String location, int time) {
        this.code = code;
        this.location = location;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next(), location = sc.next();
        int time = sc.nextInt();
        Agent a = new Agent(code, location, time);

        System.out.println("secret code : " + a.code);
        System.out.println("meeting point : " + a.location);
        System.out.println("time : " + a.time);

    }
}