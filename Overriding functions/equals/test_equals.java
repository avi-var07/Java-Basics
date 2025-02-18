import java.util.Scanner;
class Complex_number{
    int real, img;
    Complex_number(int real, int img){
        this.real=real;
        this.img=img;
    }
    public boolean equals(Object ob){
        if(this==ob){
            System.out.println("Same obj");
            return true;
        }
        if(!(ob instanceof Complex_number)){
            System.out.println("instances of diff type");
            return false;
        }
        Complex_number ob1 = (Complex_number)ob;  //downcasting
        if(this.real==ob1.real && this.img ==ob1.img){
            System.out.println("Values are equal");
            return true;
        }
        else
        return false;
    }
    

}
class test_equals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int real1=sc.nextInt();
        int img1=sc.nextInt();
        int real2=sc.nextInt();
        int img2=sc.nextInt();
        Complex_number ob1 = new Complex_number(real1,img1);
        Complex_number ob2 = new Complex_number(real2,img2);
        if (ob1.equals(ob2)) {
            System.out.println("Both complex numbers are equal.");
        } else {
            System.out.println("Both complex numbers are different.");
        }
        sc.close();
    }
}