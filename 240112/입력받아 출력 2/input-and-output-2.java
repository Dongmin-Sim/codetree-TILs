import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String socialNumber = sc.next();
        
        System.out.println(socialNumber.split("-")[0] + socialNumber.split("-")[1]);
    }
}