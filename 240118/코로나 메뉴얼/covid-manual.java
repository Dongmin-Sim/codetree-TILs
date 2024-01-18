import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        boolean isEmergency = false;
        int classANum = 0;

        char cought1 = sc.next().charAt(0);
        int temp1 = Integer.parseInt(sc.next());

        char cought2 = sc.next().charAt(0);
        int temp2 = Integer.parseInt(sc.next());

        char cought3 = sc.next().charAt(0);
        int temp3 = Integer.parseInt(sc.next());
        
        classANum += (cought1 == 'Y' && temp1 >= 37) ? 1:0;
        classANum += (cought2 == 'Y' && temp2 >= 37) ? 1:0;
        classANum += (cought3 == 'Y' && temp3 >= 37) ? 1:0;
        
        isEmergency = classANum >=2 ? true:false;

        if (isEmergency) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}