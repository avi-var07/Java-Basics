import java.util.*;

interface Taxable{
    double CalTax(double amt);
}
interface Interest{
    double CalInt(double amt);
}
class implementation implements Taxable, Interest{
    String name;
    double bal;
    
    implementation(String name, double bal){
        this.name = name;
        this.bal=bal;
    }
    
    public double CalTax(double amt){
        return amt*0.05;
    }
    public double CalInt(double amt){
        return amt*0.09;
    }
    void update(double bal, String name){
        bal+=CalInt(bal);
        System.out.println(bal);
        bal-=CalTax(bal);
        System.out.print(name+"! ");
        System.out.println("Balance updated succcessfully: "+bal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account holder's name");
        String name = sc.nextLine();
        System.out.println("Initial Balance: ");
        double bal = sc.nextDouble();
        
        implementation ac = new implementation(name, bal);
        ac.update(bal,name);

        sc.close();
        
    }
}