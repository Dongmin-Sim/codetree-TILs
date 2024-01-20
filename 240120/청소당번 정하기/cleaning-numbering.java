import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int classCnt = 0, hallCnt = 0, bathroomCnt = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 6 != 0) {
                classCnt++;
            } else if (i % 3 == 0 && i % 12 != 0) {
                hallCnt++;
            } else if (i % 12 == 0) {
                bathroomCnt++;
            }
        }
        System.out.print(classCnt + " " + hallCnt + " " + bathroomCnt);
    }   
}