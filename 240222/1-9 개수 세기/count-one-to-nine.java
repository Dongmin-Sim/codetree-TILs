import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] countArr = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            System.out.println(countArr[i]);
        }
    }
}