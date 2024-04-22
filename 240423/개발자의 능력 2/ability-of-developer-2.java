import java.util.Scanner;

public class Main {
    public static int N = 6;
    public static int[] people = new int[N];
    public static int total = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            people[i] = sc.nextInt();
            total += people[i];
        }


        int minValue = Integer.MAX_VALUE;
        // 첫번째팀 고르기 (2/6)
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                int firstTeam = people[i] + people[j];
                // 두번째팀 고르기 (2/4)
                for (int k = 0; k < 6; k++) {
                    for (int l = k+1; l < 6; l++) {
                        // 첫번째 팀원과 두번째 팀원과 겹치면 안됨.
                        if ((k == i || k == j) || (l == i || l == j)) {
                            continue;
                        }

                        int secondTeam = people[k] + people[l];
                        int thirdTeam = total - firstTeam - secondTeam;
                        int bigTeam = Math.max(thirdTeam, Math.max(firstTeam, secondTeam));
                        int smallTeam = Math.min(thirdTeam, Math.min(firstTeam, secondTeam));
                        minValue = Math.min(minValue, Math.abs(bigTeam - smallTeam));
                    }
                }
            }
        }
        System.out.println(minValue);
    }
}