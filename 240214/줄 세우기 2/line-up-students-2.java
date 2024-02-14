import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    public int height, weight, id;

    public Student(int height, int weight, int id) {
        this.height = height;
        this.weight = weight;
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        if (o.height == height) {
            return o.weight - weight;
        }
        return height - o.height;
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

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i + 1);
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }
}