import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person {
    public String name;
    public int kor, eng, math;

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + math;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            people[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.kor == o2.kor) {
                    if (o1.eng == o2.eng) {
                        return o2.math - o1.math;
                    }
                    return o2.eng - o1.eng;
                }
                return o2.kor - o1.kor;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(people[i]);
        }


    }
}