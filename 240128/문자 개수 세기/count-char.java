import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String alpha = sc.next();
        int sum = 0;

        for(int i = 0; i < line.length(); i++){
            if (line.charAt(i) == alpha.charAt(0)) {
                sum++;
            }
        }
        System.out.print(sum);
    }
}