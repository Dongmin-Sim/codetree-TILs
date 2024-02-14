import java.util.Arrays;
import java.util.Scanner;

class Number implements Comparable<Number>{
    public int id, number;

    public Number(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @Override
    public int compareTo(Number o) {
        if (o.number != number) {
            return number - o.number;
        }
        return id - o.id;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Number[] numbers = new Number[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = new Number(i, sc.nextInt());
        }

        Arrays.sort(numbers);

        int[] rank = new int[n];
        // 3(0) 1(1) 6(2) 2(3) 7(4) 30(5) 1(6)
        // 1(1) 1(6) 2(3) 3(0) 6(2) 7(4) 30(5)
        // 3(0):4 1(1):1 .. 
        for (int i = 0; i < n; i++) {
            rank[numbers[i].id] = i+1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }

    }
}