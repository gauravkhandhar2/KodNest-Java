import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----My Role Software Developer");
        System.out.println("My Role: Java Developer");
        System.out.println("My Target: Get Placement");
        System.out.println("Daily Practice: 8 Hours");

        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("The name is " + name + " age is " + age);

        sc.close();

    }
}
