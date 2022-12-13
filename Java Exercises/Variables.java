import java.util.Scanner;

public class Variables {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        Integer age = sc.nextInt();
        sc.close();
        System.out.println("I am " + fullName + " and I'm " + age + " years old");
    }
}
