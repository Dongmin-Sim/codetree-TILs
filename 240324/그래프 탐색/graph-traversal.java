import java.util.Scanner;

public class Main {

    public static int VERTICES_NUM;
    public static int EDGES_NUM;
    public static int[][] graph;
    public static boolean[] visited;

    public static int cnt = 0;
    public static void DFS(int vertex) {
        for (int currV = 1; currV < VERTICES_NUM + 1; currV++) {
            if (graph[vertex][currV] == 1 && !visited[currV]) {
                visited[currV] = true;
                cnt++;
                DFS(currV);
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        VERTICES_NUM = sc.nextInt();
        EDGES_NUM = sc.nextInt();

        graph = new int[VERTICES_NUM + 1][VERTICES_NUM + 1];
        visited = new boolean[VERTICES_NUM + 1];

        // graph 세팅
        for (int i = 0; i < EDGES_NUM; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        visited[1] = true;
        // DFS 수행
        DFS(1);


        // 결과 출력
        System.out.println(cnt);
    }


}