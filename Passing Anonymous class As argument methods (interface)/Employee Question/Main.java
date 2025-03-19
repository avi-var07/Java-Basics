import java.util.Scanner;
interface empcheck{
    boolean iseligible(int salary);
}
class Update{
    void updateSal(empcheck em, int salary){
        boolean result  = em.iseligible(salary); //em.iseligible() method call hoga, ab ye method call hoga to is method ka object call hoga, execution goes to line 21 
        if(result)
        System.out.println("Salary Updated");
        else
        System.out.println("Salary Not Updated");
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        Update u = new Update();
        u.updateSal(new empcheck() {    //Anonymous class, updateSal() method ko anonymous class ka object diya ja raha hai, ab ye updateSal() method call hoga to is anonymous class ka object call hoga, execution goes to line 6 and line 7
            public boolean iseligible(int salary) {     //whatever returned goes back and stores in variable result
                if(salary > 10000) return true;
                else return false;
            }
        }, salary);
        sc.close();
    }
}