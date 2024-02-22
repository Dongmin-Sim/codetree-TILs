import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] clinic = new int[4];
        int A = 0, B = 1, C = 2, D = 3;

        for (int i = 0; i < 3; i++) {
            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (temp >= 37) {
                if (symptom == 'Y') {
                    clinic[A]++;
                } else {
                    clinic[B]++;
                }
            } else {
                if (symptom == 'Y') {
                    clinic[C]++;
                } else { // D
                    clinic[D]++;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(clinic[i] + " ");
        }

        if (clinic[A] == 2) {
            System.out.print("E");
        }
    }
}