import java.util.HashMap;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        int maxNumber = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int wordFrequency = map.getOrDefault(word, 0) + 1;
            maxNumber = Math.max(maxNumber, wordFrequency);
            map.put(word, wordFrequency);
        }
        
        System.out.println(maxNumber);
    }
}