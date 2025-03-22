import java.util.Scanner;
interface Discount{
    double getDiscount(double amnt, String type);
}
class ShoppingCart{
    double cartAmnt;
    String cartType;
    ShoppingCart(double cartAmnt, String cartType){
        this.cartAmnt=cartAmnt;
        this.cartType=cartType;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amnt: ");
        double amnt = sc.nextDouble();
        System.out.println("Enter customer type: reg(Press R)/vip(Press V): ");
        String type = sc.next().toLowerCase();
        Discount dis = new Discount(){
            public double getDiscount(double amnt, String type){
                switch (type) {
                    case "v": return amnt-(0.8*amnt);
                    case "r": return amnt-(0.25*amnt);
                    default:
                        System.out.println("Invalid input found.");
                        return amnt;
                }
            }
        };
        
        System.out.println("Final amnt: "+dis.getDiscount(amnt, type)  );
        sc.close();
    }
    
}