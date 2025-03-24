interface Calculation{
    void fact(int n);
}
class Main{
    public static void main(String[] args) {
        Calculation c = (n) -> {
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        };
        c.fact(5);
    }
}