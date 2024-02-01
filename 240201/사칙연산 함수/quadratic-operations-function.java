import java.util.Scanner;


public class Main {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char op = sc.next().charAt(0);
        int c = sc.nextInt();

        int result = 0;
        if(op == '+') {
            result = plus(a, c);
        } else if (op == '-') {
            result = minus(a, c);
        } else if (op == '*') {
            result = multiply(a, c);
        } else if (op == '/') {
            result = divide(a, c);
        } else {
            System.out.print("False");    
            return;
        }
        System.out.print(a + " " + op + " " + c + " = " + result);
    }
}