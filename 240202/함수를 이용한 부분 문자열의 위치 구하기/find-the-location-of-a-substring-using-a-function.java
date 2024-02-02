import java.util.Scanner;

public class Main {
    public static int startIdx = 0; 
    public static void subSequence(String word, String sub) {
        int subIdx = 0;

        for(int i = 0; i < word.length(); i++) {
            
            if(subIdx >= sub.length()) {
                break;
            }

            if(word.charAt(i) == sub.charAt(0) && subIdx == 0) {
                startIdx = i;
                subIdx++;
                
            } else if (word.charAt(i) == sub.charAt(subIdx)) {
                subIdx++;
            } else {
                startIdx = -1;
                subIdx = 0;
            }
            // System.out.println("st idx" + i + " : " + startIdx + " " + subIdx);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String sub = sc.next();
        subSequence(word, sub);
        System.out.print(startIdx);
        
    }


}