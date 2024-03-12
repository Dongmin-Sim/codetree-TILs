import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        char[] charArray = inputStr.toCharArray();
        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {
            int query = sc.nextInt();


            if (query == 1) {
                int first = sc.nextInt()-1, second = sc.nextInt()-1;
                char temp = charArray[first];
                charArray[first] = charArray[second];
                charArray[second] = temp;
            } else if (query == 2) {
                char inputChar = sc.next().charAt(0);
                char targetChar = sc.next().charAt(0);

                for (int j = 0; j < charArray.length; j++) {
                    if (charArray[j] == inputChar) {
                        charArray[j] = targetChar;
                    }
                }
            }

            System.out.println(String.valueOf(charArray));
        }
    }
}