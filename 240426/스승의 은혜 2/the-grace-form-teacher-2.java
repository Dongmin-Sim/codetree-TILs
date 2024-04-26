import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] present;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        present = new int[n];

        for (int i = 0; i < n; i++) {
            present[i] = sc.nextInt();
        }

        Arrays.sort(present);

        int maxStudent = 0;
        for (int i = 0; i < n; i++) {
            int budget = 0;
            int student = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    budget += present[i] / 2;
                    if (budget <= b) {
                        student++;
                    }
                    continue;
                }

                budget += present[j];
                if (budget <= b) {
                    student++;
                } else {
                    break;
                }
            }
            maxStudent = Math.max(maxStudent, student);
        }
        System.out.println(maxStudent);
    }
}