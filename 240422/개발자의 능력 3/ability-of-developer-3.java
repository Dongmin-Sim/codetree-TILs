import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] developer = new int[6];

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            developer[i] = sc.nextInt();
            sum += developer[i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                for (int k = j+1; k < 6; k++) {
                    int teamA = developer[i] + developer[j] + developer[k];
                    int teamB = sum - teamA;
                    min = Math.min(min, Math.abs(teamA - teamB));
                }
            }
        }
        System.out.println(min);
    }
}