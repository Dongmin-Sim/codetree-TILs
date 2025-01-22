import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++) {
            int answer = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j=0; j<n; j++) {
                if (start<=array[j] && array[j] <= end) answer++;
            }
            System.out.println(answer);
        }        
    }
}