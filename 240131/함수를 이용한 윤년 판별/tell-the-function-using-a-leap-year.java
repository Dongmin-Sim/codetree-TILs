import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(isYunYear(year)) {
            System.out.print("true");
        }else {
            System.out.print("false");
        }
    }

    public static boolean isYunYear(int year) {
        if(year % 4 != 0){
            return false;
        }
        if(year % 100 == 0 && year %400 !=0) {
            return false;
        }

        return true;
    }
}