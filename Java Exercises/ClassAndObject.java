public class ClassAndObject {
    public String Name;
    public int Age;

    public void set(String name, int age) {
        Name = name;
        Age = age;
    }

    public void get() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }

    public static void main(String[] args) {
        ClassAndObject c1 = new ClassAndObject();
        c1.set("Sanjay", 21);
        c1.get();
        ClassAndObject c2 = new ClassAndObject();
        c2.set("Suarez", 24);
        c2.get();
    }
}