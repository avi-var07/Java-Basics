import java.util.Scanner;

class Count_Words {
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        Scanner sc = new Scanner(System.in);
        String sent = sc.nextLine().trim();
        int count=sent.split("\\s+").length;
        System.out.println(count);
        sc.close();
    }
}