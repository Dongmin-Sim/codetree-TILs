import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        ValWrapper instanceN = new ValWrapper(n);
        ValWrapper instanceM = new ValWrapper(m);
        swap(instanceN, instanceM);

        System.out.println(instanceN.getVal() + " " + instanceM.getVal());
    }

    public static void swap(ValWrapper n, ValWrapper m) {
        int temp = n.getVal();
        n.setVal(m.getVal());
        m.setVal(temp);
    }

    public static class ValWrapper {
        private int val;

        public ValWrapper(int val) {
            this.val = val;
        }

        public int getVal(){
            return val;
        }

        public void setVal(int val){
            this.val = val;
        }
    }
}