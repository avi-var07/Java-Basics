import java.util.Scanner;
class bit_manipulation{
    void loan(int credit, long income){ 
        System.out.println((credit>700 && income>50000)?"Eligible":"Not eligible");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int credit = sc.nextInt();
        long income = sc.nextLong();
        System.out.println(n^1);
        
        bit_manipulation b = new bit_manipulation();
        b.loan(credit,income);
        sc.close();
    }
}