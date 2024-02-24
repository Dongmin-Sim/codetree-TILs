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

        int idxA = 0, idxB = 0;

        boolean flag = false;
        while (true) {
            // 남은 검사 수가 B보다도 작고, 맞지 않을때 , 더 이상 진행할 필요 없음.
            if (n1 - idxA < n2 && arrA[idxA-1] != arrB[idxB]) {
                break;
            }
            // B가 부분수열일 경우 종료

            if (arrA[idxA] == arrB[idxB]) {
                if (idxB == n2 - 1) {
                    flag = true;
                    break;
                }
                idxA++;
                idxB++;
            } else {
                idxA++;
                idxB = 0;
            }

        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}