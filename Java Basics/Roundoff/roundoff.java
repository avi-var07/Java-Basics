public class roundoff {
    public static void main(String[] args) {
        
        float a = 3.146f;
        System.out.printf("%.2f ",a);  //ye round krra 2 decimal tk
        double b = Math.floor(a*100);
        System.out.println(b);
        System.out.println(b/100+0.5);
    }


}
