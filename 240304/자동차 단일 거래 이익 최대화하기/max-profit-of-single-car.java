import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int maxProfit = 0;
        int minPrice = price[0];
        for (int i = 1; i < n; i++) {
            int profit = price[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (price[i] < minPrice) {
                minPrice = price[i];
            }
        }
        System.out.println(maxProfit);
    }
}