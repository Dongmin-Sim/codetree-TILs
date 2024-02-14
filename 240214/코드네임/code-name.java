import java.util.Scanner;

class Agent {
    public String codeName;
    public int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5]; 

        for(int i = 0; i < 5; i++) {
            String inputName = sc.next();
            int inputScore = sc.nextInt();
            agents[i] = new Agent(inputName, inputScore);
        } 

        int min = 100;
        int idx = 0;
        for(int i = 0; i < agents.length; i++) {
            if (min > agents[i].score) {
                min = agents[i].score;
                idx = i;
            }
        }

        System.out.print(agents[idx].codeName + " " + agents[idx].score);

    }
}