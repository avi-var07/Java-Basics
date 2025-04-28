import java.util.*;
class Book{
    String name;
    int id;
    int price;

    Book(String name, int id, int price){
        this.name=name;
        this.id=id;
        this.price=price;
    }
    void display(){
        System.out.println("Book Name: "+name);
        System.out.println("Book ID: "+id);
        System.out.println("Book Price: "+price);
    }
}
class Comp implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.name.compareTo(b2.name);
    }

}
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Book> books = new ArrayList<Book>();    
        for(int i=0; i<n; i++){
            System.out.println("Enter the name of book "+(i+1)+": ");
            String name = sc.nextLine();
            System.out.println("Enter the id of book "+(i+1)+": ");
            int id = sc.nextInt();
            System.out.println("Enter the price of book "+(i+1)+": ");
            int price = sc.nextInt();
            sc.nextLine();
            books.add(new Book(name, id, price));
        }
        Collections.sort(books, new Comp());
        System.out.println("Books sorted by name: ");
        for(Book book : books){
            book.display();
            System.out.println();
        }
        sc.close();
    }
}