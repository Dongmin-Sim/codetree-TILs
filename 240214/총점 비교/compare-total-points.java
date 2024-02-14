import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    public String name;
    public int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + math;
    }

    @Override
    public int compareTo(Student o) {
        return (kor + eng + math) - (o.kor + o.eng + o.math);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }
}