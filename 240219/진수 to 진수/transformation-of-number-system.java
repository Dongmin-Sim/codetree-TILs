import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int n = sc.nextInt();

        int temp = someTo10(a, Integer.toString(n));
        tenToSome(b, temp);
    }

    public static int someTo10(int a, String n) {
        // a 진수로 표현된 n을 10진수로
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }

        return num;
    };

    public static void tenToSome(int b, int n) {
        int[] binary = new int[1000];
        int cnt = 0;

        while (true) {
            if (n < b) {
                binary[cnt++] = n;
                break;
            }

            binary[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt-1; i >=0; i--) {
            System.out.print(binary[i]);
        }
    }
}