import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
    public String name;
    public int height;
    public int weight;

    public Person() {
    }

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return height - o.height;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people);

        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }
    }
}