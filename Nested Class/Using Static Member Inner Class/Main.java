import java.util.Scanner;
class ShoppingCart{
    double bill;
    static class DiscountCalculator{
        double GoldMember(double bill){
            return 0.2*bill;
        }
        double SilverMember(double bill){
            return 0.1*bill;
        }
        double RegularMember(double bill){
            return 0.05*bill;
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount");
        double bill = sc.nextDouble();
        System.out.println("Enter the membership type");
        String membership = sc.next().toLowerCase();
        // ShoppingCart cart = new ShoppingCart();
        ShoppingCart.DiscountCalculator dc = new ShoppingCart.DiscountCalculator();
        switch(membership){
            case "gold":
                System.out.println("Discount: "+ dc.GoldMember(bill));
                System.out.println("Final amount: "+(bill- dc.GoldMember(bill)));
                break;
            case "silver":
                System.out.println("Discount: "+ dc.SilverMember(bill));
                System.out.println("Final amount: "+(bill- dc.SilverMember(bill)));
                break;
            case "regular":
                System.out.println("Discount: "+ dc.RegularMember(bill));
                System.out.println("Final amount: "+(bill- dc.RegularMember(bill)));
                break;
            default:
                System.out.println("Invalid membership type");
        }
        sc.close();
    }
}