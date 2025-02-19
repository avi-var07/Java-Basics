import java.util.*;
interface Result{
    double CalPer(double CGPA);
}
class GradStudent implements Result{
    public double CalPer(double CGPA){
        return CGPA*9.5;
    }
}
class PostGradStudent implements Result{
    public double CalPer(double CGPA){
        return CGPA*10;
    }
}
class CGPA_to_Percentage{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P for Postgraduation calculation whose factor is 10 or G for Graduation whose factor is 9.5: ");
        char ch=  sc.next().charAt(0);
        System.out.println("Enter the Roll Number: ");
        long roll = sc.nextInt();
        System.out.println("Enter CGPA of Student: ");
        double CGPA = sc.nextDouble();
        Result r;
        switch(ch){
            case 'P':
                r=new PostGradStudent();
                System.out.println("Student with roll: "+roll+" has "+r.CalPer(CGPA)+" Percentage in PostGraduation.");
                break;
            case 'G':
                r=new GradStudent();
                System.out.println("Student with roll: "+roll+" has "+r.CalPer(CGPA)+" Percentage in Graduation.");
                break;
            default:
            System.out.println("Invalid input");
        }
        sc.close();
    }
}