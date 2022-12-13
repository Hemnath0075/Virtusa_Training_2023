import java.io.*;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        try {
            int num = 10, div = 0;
            System.out.println(num / div);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        try {
            String s = "Hello";
            System.out.println(s.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        File file = new File("D://file.txt");
        try (FileReader fr = new FileReader(file)) {
            System.out.println(fr.read());
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try {
            int a[] = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            int num = Integer.parseInt("hello");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}