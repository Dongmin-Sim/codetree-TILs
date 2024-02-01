import java.util.Scanner;

public class Main {
    public static boolean checkSequence(int[] arr1, int[] arr2) {
        int arr2pt = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr2pt < arr2.length && arr1[i] == arr2[arr2pt]) {
                arr2pt++;
            }
        }

        return arr2pt == arr2.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        if(checkSequence(arr1, arr2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        };
    }
}