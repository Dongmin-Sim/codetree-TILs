import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }

        for(int i=0; i<n; i++) {
            map.put(array[i], map.get(array[i]) - 1);

            for(int j=0; j<i; j++) {
                int temp = k - (array[i] + array[j]);
                if (map.containsKey(temp) && map.get(temp) > 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}