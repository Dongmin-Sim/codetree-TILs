import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n*2];

        for(int i = 0; i < n*2; i++) {
            arr[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(arr);
        int max = 0;

        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i] + arr[(n*2)-i-1];
            //System.out.println(temp);
            if(temp > max){
                max = temp;
            }
        }
        System.out.print(max);
    }
}