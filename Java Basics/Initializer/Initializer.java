import java.util.Scanner;
class First{
    static int data=100;
    int id;
    String pr_name;
    double pr_cost;
    {
        id=data+1;
        System.out.println("Product id: "+id);
        data++;
    }
    First(){
        pr_name = "default";
        pr_cost=0;
    }
    First(String pr_name, double pr_cost){
        this.pr_name=pr_name;
        this.pr_cost=pr_cost;
    }
    void setDetails(Scanner sc){
        pr_name = sc.nextLine();
        pr_cost = sc.nextDouble();
        sc.nextLine();
        
    }
    void getDetails(){
        System.out.println("Product name: "+pr_name);
        System.out.println("Product cost: "+pr_cost);
    }
}
class Initializer{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){

            First f = new First();
            f.setDetails(sc);
            f.getDetails();

        }
        sc.close();
    }
}