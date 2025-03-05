import java.util.Scanner;

class Linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;
    void insert(int data){
        if(head==null)
        head = new Node(data);
        else{
            Node temp =head;    //to go until we reach end, if worked on head, then head will be lost.
            while(temp.next!=null){
                temp=temp.next; //points to end
            }
            temp.next = new Node(data);
        }
    }
    void display(){
        if(head==null)
        System.out.println("Nothing to display! ");
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to insert: ");
        int n = sc.nextInt();

        Linkedlist list = new Linkedlist();
        for(int i=0;i<n;i++){
            System.out.println("Enter: ");
            int value = sc.nextInt();
            list.insert(value);
        }
        list.display();
        sc.close();
    }
}