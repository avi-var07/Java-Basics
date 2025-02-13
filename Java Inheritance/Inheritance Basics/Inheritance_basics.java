import java.util.Scanner;
class Employee
{
  int eid;
  String ename;
  void getemp(Scanner sc)
  {
    eid=sc.nextInt();
    sc.nextLine();
    ename=sc.nextLine();  
}
void putemp()
{
    System.out.println("eid and ename:"+eid+" "+ename);   
}

}
class Teacher extends Employee
{
    int tload;
    String tsub;
    void gettea(Scanner sc)
    {
        getemp(sc);
        tload=sc.nextInt();
        sc.nextLine();
        tsub=sc.nextLine();
    }
 void puttea()
 {
     putemp();
    System.out.println("tload and tsub:"+tload+" "+tsub); 
 }
}
class Inheritance_basics
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     Teacher ob=new Teacher();
     ob.gettea(sc);
     ob.puttea();
        
      
    }
}