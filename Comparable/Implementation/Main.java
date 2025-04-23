import java.util.*;

class Student implements Comparable<Student>{
    int roll;
    String name;

    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Roll: "+roll+" Name: "+name);
    }
    public int compareTo(Student other){
        return Integer.compare(this.roll, other.roll);
    }
}
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        System.out.println("Number of students: ");
        int n=sc.nextInt();

        System.out.println("Enter roll number and name of each student:");
        for(int i=0;i<n;i++){
            int roll = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            arr.add(new Student(roll, name));
        }

        Collections.sort(arr);
        System.out.println("Sorted based on roll: ");

        for(Student s: arr)s.display();
        
        sc.close();
    }

}