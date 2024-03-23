import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int VERTICES_NUM;
    public static int EDGES_NUM;

    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;

    public static int cnt = 0;

    public static void DFS(int vertex) {
        for (int i = 1; i < graph[vertex].size(); i++) {
            int currV = graph[vertex].get(i);
            if (!visited[currV]) {
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

        graph = new ArrayList[VERTICES_NUM + 1];
        visited = new boolean[VERTICES_NUM + 1];

        for (int i = 0; i < EDGES_NUM; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start].add(end);
            graph[end].add(start);
        }

        // DFS 실행
        visited[1] = true;
        DFS(1);

        // 출력
        System.out.println(cnt);
    }
}