import java.util.Scanner;

public class Main {
    public static int[] array;
    final static int SUBTRACT = 2;
    final static int BLANK = 0;
    public static int[] s = new int[SUBTRACT];
    public static int[] e = new int[SUBTRACT];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < SUBTRACT; i++) {
            s[i] = sc.nextInt()-1;
            e[i] = sc.nextInt()-1;
        }

        for (int i = 0; i < SUBTRACT; i++) {
            for (int j = s[i]; j <= e[i]; j++) {
                array[j] = 0;
            }

            int arrayEndOfTemp = 0;
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                if (array[j] != BLANK) {
                    temp[arrayEndOfTemp] = array[j];
                    arrayEndOfTemp++;
                }
            }
            for (int j = 0; j < arrayEndOfTemp; j++) {
                array[j] = temp[j];
            }
            n = arrayEndOfTemp;
        }

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }


    }
}