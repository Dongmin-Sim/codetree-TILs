import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        int[] arrA = new int[n1];
        int[] arrB = new int[n2];

        for (int i = 0; i < n1; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arrB[i] = sc.nextInt();
        }

        int idxB = 0;
        for (int i = 0; i < n1; i++) {
            if (idxB > n2-1) {
                break;
            }

            if (arrA[i] != arrB[idxB]) {
                idxB = 0;
            } else {
                idxB++;
            }
        }

        if (idxB > n2-1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}