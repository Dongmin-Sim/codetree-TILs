import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    public String name;
    public int height;
    public double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        System.out.println("name");
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        
        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }

        System.out.println("\nheight");
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.height - o1.height;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }

    }
}