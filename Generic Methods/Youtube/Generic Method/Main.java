class Printer {
    public <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};
        
        p.printArray(intArr);  // 1 2 3
        p.printArray(strArr);  // A B C
    }
}
