import java.util.Scanner;

class Complex {
    int real, img;

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public boolean equals(Object ob) {
        if (this == ob) {
            System.out.println("Same obj");
            return true;
        }
        if (!(ob instanceof Complex)) {
            System.out.println("Instances of different types");
            return false;
        }
        Complex ob1 = (Complex) ob; // Downcasting
        if (this.real == ob1.real && this.img == ob1.img) {
            System.out.println("Values are equal");
            return true;
        } else {
            System.out.println("Values are not equal");
            return false;
        }
    }

    public String toString() {
        return real + " + " + img + "i";
    }
}

public class TestToString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int img1 = sc.nextInt();
        int real2 = sc.nextInt();
        int img2 = sc.nextInt();

        Complex ob1 = new Complex(real1, img1);
        Complex ob2 = new Complex(real2, img2);

        if (ob1.equals(ob2)) {
            System.out.println("Both complex numbers are equal.");
        } else {
            System.out.println("Both complex numbers are different.");
        }

        sc.close();
    }
}
