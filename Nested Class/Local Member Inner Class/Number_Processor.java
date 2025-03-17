import java.util.Scanner;

class Number {
    void processNum(int a[]) {
        class Num_Check {
            boolean isEven(int n) {
                return n % 2 == 0;
            }
        }
        
        Num_Check obj = new Num_Check();
        System.out.println("Even numbers are:");
        for (int num : a) {
            if(obj.isEven(num))
            System.out.print(num + " ");
        }
    }
}

class Number_Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Number obj = new Number();
        obj.processNum(a);
        
        sc.close();
    }
}
