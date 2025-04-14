import java.io.*;
class Student implements Serializable {
    int roll;
    String name;
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    void display(){
        System.out.println("The student details are: \nRoll No: " + roll + "\nName: " + name);
    }
}
class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student(101, "John Doe");
        Student s2 = new Student(102, "Jane Smith");
        ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("students.txt"));
        ob.writeObject(s1);
        ob.writeObject(s2);
        ob.close();
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("students.txt"));
        Student s3 = (Student) ob1.readObject();
        ob1.close();
        System.out.println("Deserialized Student Object:");
        s3.display();

    }
}
/*Serialization:
Object → File (Convert object into byte stream and store it in a file)

Serializable is a marker interface (no methods, bas tag jaisa).

🔸 Deserialization:
File → Object (Read the byte stream from file and convert back into object) 

FileOutputStream opens file students.txt.

ObjectOutputStream uses that stream to write objects.

writeObject(s1) & writeObject(s2) → dono object file mein save ho jaate hain.

ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("students.txt"));
Student s3 = (Student) ob1.readObject();
File se pehla object (s1) read kiya ja raha hai.

readObject() return karta hai Object, toh usko cast karte ho Student mein.

Bas s3.display() se details print ho jaati hain.

File ban jaayegi: students.txt (binary format hoti hai, text open karoge toh samajh nahi aayega).
*/