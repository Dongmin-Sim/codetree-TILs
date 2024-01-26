import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt();
        boolean flag = false;
        for(int i = a; i<= b; i++) {
            if(i%c!= 0 && i%c!=0 )
            {
                flag = true;
            }
        }

        if(flag) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}