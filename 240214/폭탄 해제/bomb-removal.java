import java.util.Scanner;

class Bomb {
    public String code;
    public String color;
    public int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int sec = sc.nextInt();

        Bomb bomb = new Bomb(code, color, sec);

        System.out.println("code : " + bomb.code);
        System.out.println("color : " + bomb.color);
        System.out.println("second : " + bomb.second);
    }
}