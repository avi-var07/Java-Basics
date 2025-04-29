//Why do we use generics, to solve the issue of manual casting and type safety issue and there was no compile time checking;
//ArrayList list = new ArrayList();
//list.add("Hello");
//list.add(10); // this is not type safe, we can add any type of object to the list

//String s = (String) list.get(0); // manual casting

//Generics is a feature of Java that allows you to create classes, interfaces, and methods that take type parameters. This means you can create a class or method that can work with any type of object, while still providing compile-time type safety.
//Generic types allow you to define a class, interface, or method with placeholders (type parametres) for the data types they will work with.

// Generics allow you to write type-safe and reusable code. Instead of specifying a specific data type, you use a placeholder (T, E, K, V).
// A generic class with type T
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("Hello");
        System.out.println(b1.get());  // Output: Hello

        Box<Integer> b2 = new Box<>();
        b2.set(10);
        System.out.println(b2.get());  // Output: 10
    }
}
