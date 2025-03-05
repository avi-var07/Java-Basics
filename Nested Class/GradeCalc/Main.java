import java.util.Scanner;
class Student{
    class grade{
        int a,b,c;
        grade(int a, int b, int c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        double avg(){
            return (a+b+c)/3;
        }
        void gradecal(){
            double grad = avg();
            if(grad>=90)
            System.out.println("Grade: A");
            else if(grad>=80&&grad<90)
            System.out.println("Grade: B");
            else if(grad>=70&&grad<80)
            System.out.println("Grade: C");
            else if(grad>=60&&grad<70)
            System.out.println("Grad: D");
            else
            System.out.println("Fail");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        System.out.println("1: ");
        int a= sc.nextInt();
        System.out.println("2: ");
        int b= sc.nextInt();
        System.out.println("3: ");
        int c= sc.nextInt();

        Student s = new Student();
        Student.grade g = s.new grade(a,b,c);
        System.out.println("Average: "+g.avg());
        g.gradecal();
        sc.close();
    }
}