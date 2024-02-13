import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static String[] arr;
    public static String[] newArr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String t = sc.next();

        arr = new String[n];
        
        // 1. 문자열 t로 시작하는가?
        int cnt = 0;
        for(int i = 0; i<n; i++) {
            String temp = sc.nextLine();

            if(startAtT(temp, t)) {
                cnt++;
                arr[i] = temp;
            } else {
                arr[i] = null;
            }
            
        }

        // 2. 1에 해당하는 문자열 중 정렬했을때 k번째 문자열은 무엇?
        newArr = new String[cnt];

        int idx = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] != null) {
                newArr[idx] = arr[i];
                idx++;
            }
        }
        Arrays.sort(newArr);
        for(int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        System.out.print(newArr[k-1]);
    }

    public static boolean startAtT(String word, String t) {
        if (word.length() < t.length()) {
            return false;
        }

        char[] wordChar = word.toCharArray();
        char[] tChar = t.toCharArray();

        for(int i = 0; i < t.length(); i++) {
            if(tChar[i] != wordChar[i]) {
                return false;
            }
        }
        return true;
    }
}