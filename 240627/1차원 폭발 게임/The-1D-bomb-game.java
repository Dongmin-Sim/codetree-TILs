import java.util.Scanner;

public class Main {
    public static final int BLANK = 0;
    public static int bombNumber;
    public static int blowUpCondition;
    public static int bombListSize;
    public static int[] bombList;
    public static void main(String[] args) {
        setup();
        // 엔드 조건 판단, list에 터질만한 폭탄이 있는가?
        while (goBomb()) {
            // 있으면 터트리기
            blowUp();
            // 압축하기
            squeezeBombList();
        }
        printBombList();
    }

    private static boolean goBomb() {
        int sameBomb = 0;
        for (int i = 0; i < bombListSize-1; i++) {
            if (bombList[i] == bombList[i + 1]) {
                sameBomb++;
                if (sameBomb + 1 >= blowUpCondition) {
                    return true;
                }
            } else {
                sameBomb = 0;
            }
        }
        return false;
    }

    private static void blowUp() {
        // 1, [3, 3, 3], 2, [1, 1], 2
        int candidateStart = bombListSize;
        int candidateEnd = 0;
        int sameCount = 0;

        for (int i = 0; i < bombListSize-1; i++) {
            // 같을 때는 start에 i를 집어 넣는다.
            if (bombList[i] == bombList[i + 1]) {
                if (sameCount == 0) {
                    candidateStart = i;
                }
                sameCount++;
            } else {
                // 다를 때는 end에 i를 집어 넣는다.
                candidateEnd = i;
                if ((sameCount + 1) >= blowUpCondition) {
                    for (int j = candidateStart; j <= candidateEnd; j++) {
                        bombList[j] = 0;
                    }
                }
                sameCount = 0;
            }
        }
        if ((sameCount + 1) >= blowUpCondition) {
            for (int j = candidateStart; j <= bombListSize; j++) {
                bombList[j] = 0;
            }
        }
    }

    private static void squeezeBombList() {
        int[] tempList = new int[bombListSize];
        int tempIndex = 0;
        for (int i = 0; i < bombListSize; i++) {
            if (bombList[i] != BLANK) {
                tempList[tempIndex++] = bombList[i];
            }
        }
        for (int i = 0; i < tempIndex; i++) {
            bombList[i] = tempList[i];
        }
        bombListSize = tempIndex;
    }

    private static void printBombList() {
        System.out.println(bombListSize);
        for (int i = 0; i < bombListSize; i++) {
            System.out.println(bombList[i]);
        }
    }

    private static void setup() {
        Scanner sc = new Scanner(System.in);
        bombNumber = sc.nextInt();
        blowUpCondition = sc.nextInt();

        bombListSize = bombNumber;
        bombList = new int[bombListSize];
        for (int i = 0; i < bombNumber; i++) {
            bombList[i] = sc.nextInt();
        }
    }
}