import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int stringLength = 0;
        int startAcnt = 0;

        for(int i = 0; i< 3; i++) {
            String s = sc.next();
            stringLength += s.length();
            if(s.charAt(0) == 'a') {
                startAcnt++;
            }
        }

        System.out.println(stringLength + " " + startAcnt);

    }
}