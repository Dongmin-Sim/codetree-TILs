import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            int cur = sc.nextInt();


            
            int l = 0, r = array.length;
            int answerIdx = -1;
            while(l<= r) {
                int mid = l + (r-l)/2;

                if (array[mid] == cur) {
                    answerIdx = mid+1;
                    break;
                }

                if (array[mid] < cur) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(answerIdx);
        }
    }
}