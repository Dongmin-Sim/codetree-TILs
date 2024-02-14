import java.util.Scanner;

class Product {
    public String name;
    public int code;

    public Product() {
        name = "codetree";
        code = 50;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Product productA = new Product();
        Product productB = new Product(name, code);

        System.out.println("product " + productA.code + " is " + productA.name);
        System.out.println("product " + productB.code + " is " + productB.name);
    }
}