import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String ee = "ee";
        String ab = "ab";
        
        if (a.contains(ee)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (a.contains(ab)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}