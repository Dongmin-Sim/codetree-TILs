import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    public String name;
    public String address;
    public String region;

    public Person() {
    }

    public Person(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(sc.next(), sc.next(), sc.next());
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        System.out.println("name " + people[0].name);
        System.out.println("addr " + people[0].address);
        System.out.println("city " + people[0].region);

    }
}