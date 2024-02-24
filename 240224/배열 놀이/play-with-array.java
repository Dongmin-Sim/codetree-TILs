import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), q = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();

            if (query == 1){ // a 번째 원소를 출력
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if (query == 2) { // a 가 있는지 판단,
                int a = sc.nextInt();

                int cnt = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == a) {
                        cnt = j+1;
                        break;
                    }
                }
                System.out.println(cnt);

            } else if (query == 3) { // a번째 원소부터 b번째 원소까지 순서대로 공백을 사이에 두고 출력
                int a = sc.nextInt(), b = sc.nextInt();
                for (int j = a; j <= b; j++) {
                    System.out.print(arr[j-1] + " ");
                }
            }
        }
    }
}