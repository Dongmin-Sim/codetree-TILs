import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Integer[] arrA = new Integer[n];
        Integer[] arrB = new Integer[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = Integer.valueOf(sc.nextInt());
        }

        for(int i = 0; i < n; i++) {
            arrB[i] = Integer.valueOf(sc.nextInt());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for(int i = 0; i < n; i++){
            if(!arrA[i].equals(arrB[i])) {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}