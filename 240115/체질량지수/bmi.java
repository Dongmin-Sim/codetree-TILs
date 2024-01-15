import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt(), weight = sc.nextInt();

        int bmi = (weight *100 *100) / (height*height);

        System.out.println(bmi);
        if (bmi >= 25)
            System.out.println("Obesity");

    }
}