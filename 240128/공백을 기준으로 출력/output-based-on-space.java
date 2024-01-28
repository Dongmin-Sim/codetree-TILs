import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = line1 + line2;
        String newLine = "";

        for(int i = 0; i < line3.length(); i++) {
            if(line3.charAt(i) != ' ') {
                newLine+=line3.charAt(i);
            }
        }

        System.out.print(newLine);
    }
}