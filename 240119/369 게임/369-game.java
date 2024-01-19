import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++) {
            if(i%3==0 || (i%3==1 && (i%5)%3 ==0 && i%5!=0)) {
                System.out.print(0 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    // 1, 2, (3), 4, 5, (6), 7, 8, (9), 10, 11, (12), (13), 14, (15), (16), 17, (18), (19), 20 
    // 1, 2, 4, 5, 6, 7, 10, 11, 14, 17, 20, 
    // 13, 16, 19 
}