import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line1 = sc.next(), line2 = sc.next(), line3 = sc.next();
        int line1Length = line1.length(); 
        int line2Length = line2.length();
        int line3Length = line3.length();

        if(line1Length > line2Length) {
            if (line2Length > line3Length) {
                System.out.print(line1Length-line3Length);
            } else {
                if (line1Length > line3Length) {
                    System.out.print(line1Length-line2Length);
                } else {
                    System.out.print(line3Length-line2Length);
                }
            }
        } else { // 2 > 1
            if (line1Length > line3Length) { // 2 > 1 > 3
                System.out.print(line2Length-line3Length);
            } else { // 2 ? 3 > 1
                if (line2Length > line3Length) { // 2 > 3 > 1
                    System.out.print(line2Length-line1Length);
                } else { // 3 > 2 > 1
                    System.out.print(line3Length-line1Length);
                }
            }
        }

    }
}