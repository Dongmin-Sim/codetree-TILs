import java.util.Scanner;

public class Main {
    public static int N = 5;
    public static int[] people = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 0; i < N; i++) {
            people[i] = sc.nextInt();
            total += people[i];
        }

        int minValue = Integer.MAX_VALUE;
        // 첫번째 팀 선정
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int firstTeam = people[i] + people[j];

                for (int k = 0; k < N; k++) {
                    if ((k == i) || (k == j)) continue;
                    int secondTeam = people[k];
                    int thirdTeam = total - firstTeam - secondTeam;

                    if (firstTeam == secondTeam || secondTeam == thirdTeam || firstTeam == thirdTeam) {
                        continue;
                    }
                    int bigTeam = Math.max(firstTeam, Math.max(secondTeam, thirdTeam));
                    int smallTeam = Math.min(firstTeam, Math.min(secondTeam, thirdTeam));
                    minValue = Math.min(minValue, bigTeam - smallTeam);
                }
            }
        }
        System.out.println(minValue == Integer.MAX_VALUE?-1:minValue);
    }
}