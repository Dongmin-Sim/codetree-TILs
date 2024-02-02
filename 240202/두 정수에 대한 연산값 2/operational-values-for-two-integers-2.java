import java.util.Scanner;

class Wrapper{
    public int val;

    public Wrapper(int val){
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        Wrapper wa = new Wrapper(a);
        Wrapper wb = new Wrapper(b);

        changeNum(wa, wb);

        System.out.print(wa.val + " " + wb.val);
    }

    public static void changeNum(Wrapper wa, Wrapper wb){
        if (wa.val > wb.val) {
            wa.val *= 2;
            wb.val += 10;
        } else {
            wb.val *= 2;
            wa.val += 10;
        }
    }
}