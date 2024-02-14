import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
    public int id;
    public int height, weight;

    public Person(int id, int height, int weight) {
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        if (o.height != height) {
            return o.height - height;
        }
        if (o.weight != weight) {
            return o.weight - weight;
        }
        return id - o.id;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + id;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            people[i] = new Person((i + 1), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people);

        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }
    }
}