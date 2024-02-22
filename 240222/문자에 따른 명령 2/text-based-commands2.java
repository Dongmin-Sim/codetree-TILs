import java.util.Scanner;

public class Main {

    public static int dirNum = 0;
    public static int[] dx = new int[]{0, 1, 0, -1};
    public static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String instruction = sc.next();
        int nx = 0, ny = 0;
        
        for (int i = 0; i < instruction.length(); i++) {
            char dir = instruction.charAt(i);

            if (dir == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if (dir == 'R') {
                dirNum = (dirNum + 1) % 4;
            }

            nx = dx[dirNum];
            ny = dy[dirNum];
        }

        System.out.print(nx + " " + ny);
    }
}